package com.alura.forohub.controllers;

import com.alura.forohub.DtoGetData.user.DtoLoginDataUser;
import com.alura.forohub.Services.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/login")
public class LoginController
{
    @Autowired
    ServiceUser serviceUser;

    @PostMapping
    @Operation(summary = "Receive the username and password and it returns a JWT with authentication data", tags = "Authentication")
    public ResponseEntity checkAuthentication(@RequestBody DtoLoginDataUser dtoLoginDataUser)
    {
        return ResponseEntity.ok(serviceUser.authenticateUser(dtoLoginDataUser));
    }
}
