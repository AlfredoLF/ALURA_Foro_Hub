package com.alura.forohub.DtoGetData.topics;

import com.alura.forohub.models.Course;
import com.alura.forohub.models.Status;
import com.alura.forohub.models.User;

import java.time.LocalDateTime;

public record DtoTopicData (
        String title,
        String message,
        LocalDateTime creationdate,
        Status status,
        User author,
        Course course
)
{
}
