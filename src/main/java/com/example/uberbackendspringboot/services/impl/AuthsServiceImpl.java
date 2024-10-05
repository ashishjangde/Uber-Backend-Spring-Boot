package com.example.uberbackendspringboot.services.impl;

import com.example.uberbackendspringboot.dto.DriverDto;
import com.example.uberbackendspringboot.dto.SignupDto;
import com.example.uberbackendspringboot.dto.UserDto;
import com.example.uberbackendspringboot.services.AuthService;

public class AuthsServiceImpl implements AuthService {
    @Override
    public String login(String username, String password) {
        return "";
    }

    @Override
    public UserDto SignUp(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onBoardDriver(Long userId) {
        return null;
    }
}
