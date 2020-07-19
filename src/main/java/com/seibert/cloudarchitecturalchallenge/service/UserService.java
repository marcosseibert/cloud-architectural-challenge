package com.seibert.cloudarchitecturalchallenge.service;

import com.seibert.cloudarchitecturalchallenge.domain.User;
import com.seibert.cloudarchitecturalchallenge.dto.UserDto;
import com.seibert.cloudarchitecturalchallenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<UserDto> findAllUsers(){
        List<UserDto> list = new ArrayList<>();
        getUsers().forEach(item -> list.add(new UserDto(item)));
        return list;
    }

    /**
        simulate database
     **/
    private List<User> getUsers(){
        save();
        return  userRepository.findAll();
    }

    private void save(){
        userRepository.saveAll(simulate());
    }

    private List<User> simulate() {
        User user = new User();
        user.setUserId(123L);
        user.setName("João de Almeida Junior");
        user.setEmail("joao-almeida@gmail.com");
        user.setAddress("rua: Serafim numero: 1000");
        user.setCpf("234.309.190-02");
        user.setPhone("(19)3232-3636");
        user.setSmoker("s");

        User user2 = new User();
        user2.setUserId(124L);
        user2.setName("Carolina de Alencar");
        user2.setEmail("carolina-alencar@gmail.com");
        user2.setAddress("rua: Barnabé numero: 1500");
        user2.setCpf("234.309.190-02");
        user2.setPhone("(19)3535-4343");
        user2.setSmoker("n");

        User user3 = new User();
        user3.setUserId(125L);
        user3.setName("José da silva");
        user3.setEmail("jose-silva@gmail.com");
        user3.setAddress("rua: Moreira Sales numero: 1500");
        user3.setCpf("888.309.190-02");
        user3.setPhone("(19)555-7711");
        user3.setSmoker("n");

        User user4 = new User();
        user4.setUserId(126L);
        user4.setName("João de Alencar");
        user4.setEmail("joao-alencar@gmail.com");
        user4.setAddress("rua: Afonso de sousa numero: 1500");
        user4.setCpf("341.555.190-02");
        user4.setPhone("(19)3535-2299");
        user4.setSmoker("n");

        User user5 = new User();
        user5.setUserId(127L);
        user5.setName("Ana de Oliveira");
        user5.setEmail("ana-oliveira@gmail.com");
        user5.setAddress("rua: Galeao Cumbica numero: 1500");
        user5.setCpf("890.111.190-02");
        user5.setPhone("(19)5445-7878");
        user5.setSmoker("n");


        return Arrays.asList(user, user2, user3, user4, user5);
    }
}