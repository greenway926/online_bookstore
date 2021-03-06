package com.sekolahbackend.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sekolahbackend.model.UserModel;
import com.sekolahbackend.model.UserRequestModel;
import com.sekolahbackend.service.UserService;
import io.swagger.annotations.Api;

@Api
@RestController
@RequestMapping("/api/user")
public class UserRestController {
    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public UserModel register(@RequestBody @Valid UserRequestModel request, BindingResult result, HttpServletResponse response) throws IOException {
        UserModel userModel = new UserModel();
        if (result.hasErrors()) {
            response.sendError(HttpStatus.BAD_REQUEST.value(), result.getAllErrors().toString());
            return userModel;
        } else return userService.register(request);
    }
}