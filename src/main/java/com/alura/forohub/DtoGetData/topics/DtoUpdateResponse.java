package com.alura.forohub.DtoGetData.topics;

public record DtoUpdateResponse(
        String message,
        int idTopic,
        int idAuthor,
         String solution) {
}
