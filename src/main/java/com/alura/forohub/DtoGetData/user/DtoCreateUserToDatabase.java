package com.alura.forohub.DtoGetData.user;

import com.alura.forohub.models.Profile;

public record DtoCreateUserToDatabase (String username,
                                       String email,
                                       String passwordEncrypted,
                                       Profile typeOfProfile){
}
