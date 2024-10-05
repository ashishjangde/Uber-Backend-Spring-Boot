package com.example.uberbackendspringboot.services;

import com.example.uberbackendspringboot.dto.DriverDto;
import com.example.uberbackendspringboot.dto.SignupDto;
import com.example.uberbackendspringboot.dto.UserDto;

public interface AuthService {
    String login(String username, String password);
    UserDto SignUp(SignupDto signupDto);
    DriverDto onBoardDriver(Long userId);


}
