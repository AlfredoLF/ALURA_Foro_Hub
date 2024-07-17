package com.alura.forohub.DtoGetData.topics;

import com.alura.forohub.models.Topic;
import com.alura.forohub.models.User;

public record DtoCreateResponseToDatabase(
        String message,
        Topic topic,
        User author,
        String solution
) {
}
