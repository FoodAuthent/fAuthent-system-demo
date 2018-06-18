package org.foodauthent.internal.api.job;

import org.foodauthent.model.Fingerprint;
import org.foodauthent.model.FingerprintSet;
import org.foodauthent.model.PredictionJob;
import org.foodauthent.model.TrainingJob;
import org.foodauthent.model.Workflow;

public interface JobService {

    PredictionJob createNewPredictionJob(Workflow workflow, Fingerprint fingerprint);

    TrainingJob createNewTrainingJob(Workflow workflow, FingerprintSet fingerprintSet);

}
