package com.alura.forohub.DtoResponses.topics;

import com.alura.forohub.DtoResponses.user.DtoUser;

import java.time.LocalDateTime;
import java.util.List;

public record DtoResponseGetDataTopic(Integer id,
                                      String title,
                                      String message,
                                      LocalDateTime creationDate,
                                      String status,
                                      DtoUser user,
                                      String course,
                                      List<DtoResponseTopic> listResponses
                               )
{

}
