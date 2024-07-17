package com.alura.forohub.DtoResponses.topics;

import com.alura.forohub.DtoResponses.user.DtoUser;

import java.time.LocalDateTime;

public record DtoResponseTopic (
        LocalDateTime creationDate,
        String message,
        String solution,
        DtoUser author
)
{
}
