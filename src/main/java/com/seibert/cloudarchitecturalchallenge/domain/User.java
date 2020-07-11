package com.seibert.cloudarchitecturalchallenge.domain;

import lombok.Data;

@Data
public class User {

    private Long userId;

    private String name;

    private String email;

    private String phone;

    private String address;

    private String cpf;

    private boolean smoker;
}
