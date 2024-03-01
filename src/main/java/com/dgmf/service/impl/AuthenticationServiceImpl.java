package com.dgmf.service.impl;

import com.dgmf.service.AuthenticationService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public boolean authenticate(String userName, String password) {
        boolean isValidUserName =
                userName.equalsIgnoreCase("GlazDodo");
        boolean isValidPassword =
                password.equalsIgnoreCase("12345");

        return isValidUserName && isValidPassword;
    }
}
