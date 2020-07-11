package com.seibert.cloudarchitecturalchallenge.service;

import com.seibert.cloudarchitecturalchallenge.domain.User;
import com.seibert.cloudarchitecturalchallenge.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {


    public List<UserDto> findAllUsers(){
        List<UserDto> list = new ArrayList<>();
        getUsers().forEach(item -> list.add(new UserDto(item)));
        return list;
    }

    /**
        simulate database
     **/
    private List<User> getUsers(){
        User user = new User();
        user.setUserId(123L);
        user.setName("João de Almeida Junior");
        user.setEmail("joao-almeida@gmail.com");
        user.setAddress("rua: Serafim numero: 1000");
        user.setCpf("234.309.190-02");
        user.setPhone("(19)3232-3636");
        user.setSmoker(false);

        User user2 = new User();
        user2.setUserId(124L);
        user2.setName("Carolina de Alencar");
        user2.setEmail("carolina-alencar@gmail.com");
        user2.setAddress("rua: Barnabé numero: 1500");
        user2.setCpf("234.309.190-02");
        user2.setPhone("(19)3535-4343");
        user2.setSmoker(true);

        return Arrays.asList(user, user2);
    }
}