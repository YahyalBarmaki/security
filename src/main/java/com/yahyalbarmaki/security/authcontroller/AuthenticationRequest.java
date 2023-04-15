package com.yahyalbarmaki.security.authcontroller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class AuthenticationRequest {

    private String email;
    private String password;
}
