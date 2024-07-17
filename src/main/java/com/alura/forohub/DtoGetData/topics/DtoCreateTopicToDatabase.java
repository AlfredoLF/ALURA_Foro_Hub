package com.alura.forohub.DtoGetData.topics;

import com.alura.forohub.models.Course;
import com.alura.forohub.models.Status;
import com.alura.forohub.models.User;

public record DtoCreateTopicToDatabase (
        String title,
        String message,
        User user,
        Course course,
        Status status
)
{
}
