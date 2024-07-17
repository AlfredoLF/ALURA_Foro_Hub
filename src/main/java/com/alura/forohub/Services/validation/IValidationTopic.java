package com.alura.forohub.Services.validation;

import com.alura.forohub.DtoGetData.topics.DtoCreateTopicToDatabase;

public interface IValidationTopic {

    public void checkValidation(DtoCreateTopicToDatabase dataTopic);
}
