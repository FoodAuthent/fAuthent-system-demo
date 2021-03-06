package com.foodauthent.api.internal.people;

import org.foodauthent.common.exception.ServiceException;
import org.foodauthent.common.exception.UnauthorizedException;

public interface PasswordService {

	void modifyPassword(String dn, String oldPassword, String newPassword)
			throws UnauthorizedException, ServiceException;

	String generatePassword(String dn) throws UnauthorizedException, ServiceException;

	String generatePassword(String dn, int passwordLength) throws UnauthorizedException, ServiceException;

	void setPassword(String dn, String newPassword) throws UnauthorizedException, ServiceException;

}