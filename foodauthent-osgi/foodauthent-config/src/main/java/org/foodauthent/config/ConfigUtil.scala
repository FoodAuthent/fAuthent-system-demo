package org.foodauthent.config

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import org.json4s.native.Serialization.read
import org.json4s.DefaultFormats
import com.typesafe.config.ConfigRenderOptions
import java.io.File
import java.util.Optional
import scala.reflect.ManifestFactory
import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.commons.lang3.StringUtils
import scala.reflect.runtime.{ currentMirror => cm }
import com.fasterxml.jackson.databind.DeserializationFeature

/**
 * @author sboeckelmann@benelog.com
 *
 * Customized Scala wrapper for typesafe config API.
 * Read configuration classes from from typesafe as JSON and map them using json4s
 *
 */
object ConfigUtil {

  implicit val formats = DefaultFormats

  val objectMapper: ObjectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

  /**
   * load config from url
   * Internal resource location can be overriden with System property.
   * i.e. overload feed-import.conf
   * -Dconfigurtion-file.conf=/local/path/to/some-config-file.conf file
   *
   * @param cfg config location
   */
  def load(cfg: String): Config = {
    val prop = System.getProperties.getProperty(cfg);
    if (prop != null) {
      return ConfigFactory.parseFile(new File(prop))
    } else {
      return ConfigFactory.load(cfg)
    }
  }

  /**
   * read configuration class instance
   *
   * @param config typesafe config object
   * @param path config path to read config class from
   */
  def get[T <: AnyRef](config: Config, path: String)(implicit mf: Manifest[T]): Option[T] = {
    Option(read[T](config.getValue(path).render(ConfigRenderOptions.concise())))
  }

  /**
   * Java Compatible implementation for read
   * @param class type
   * @param config typesafe config object
   * @param path config path to read config class from
   */
  def get[T <: AnyRef](clazz: Class[T], config: Config, path: String): Optional[T] = {
    val symbol = cm.classSymbol(clazz)
    if (symbol.isCaseClass) {
      val mf: Manifest[T] = ManifestFactory.classType(clazz)
      val v = get[T](config, path)(mf)
      if (v.isDefined) {
        return Optional.of(v.get)
      }
    } else {
      val cfg = config.getValue(path).render(ConfigRenderOptions.concise())
      if (!StringUtils.isEmpty(cfg)) {
        return Optional.of(objectMapper.readValue(cfg, clazz))
      }
    }
    Optional.empty()
  }

}