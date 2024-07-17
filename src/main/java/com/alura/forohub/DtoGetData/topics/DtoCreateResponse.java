package com.alura.forohub.DtoGetData.topics;

public record DtoCreateResponse (
        String message,
        int idTopic,
        int idAuthor,
        String solution
)
{
}
