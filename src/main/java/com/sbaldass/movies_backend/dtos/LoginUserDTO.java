package com.sbaldass.movies_backend.dtos;

import lombok.Data;

@Data
public class LoginUserDTO {
    private String email;
    private String password;
}
