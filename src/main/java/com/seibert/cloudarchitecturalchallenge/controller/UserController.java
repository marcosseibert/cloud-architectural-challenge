package com.seibert.cloudarchitecturalchallenge.controller;

import com.seibert.cloudarchitecturalchallenge.dto.UserDto;
import com.seibert.cloudarchitecturalchallenge.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@Api(tags = "Cloud Architectural Challenge API Users")
@RestController
@RequestMapping("/challenge/pdi/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Method that return a user list")
    })
    @ApiOperation(value = "This Resource fetch all \"Usuários\"")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDto>> getAllUser(){
        return ResponseEntity.ok(userService.findAllUsers());
    }
}
