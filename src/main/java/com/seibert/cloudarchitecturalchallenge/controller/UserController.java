package com.seibert.cloudarchitecturalchallenge.controller;

import com.seibert.cloudarchitecturalchallenge.dto.UserDto;
import com.seibert.cloudarchitecturalchallenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/challenge/pdi/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDto>> getAllUser(){
        return ResponseEntity.ok(userService.findAllUsers());
    }
}
