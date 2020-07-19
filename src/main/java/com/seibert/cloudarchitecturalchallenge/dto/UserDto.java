package com.seibert.cloudarchitecturalchallenge.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.seibert.cloudarchitecturalchallenge.domain.User;
import lombok.Data;

@Data
public class UserDto {

    public UserDto(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.cpf = user.getCpf();
        this.smoker = user.getSmoker();
    }

    private String name;

    private String email;

    private String cpf;

    @JsonIgnore
    private String smoker;

    @JsonProperty("smoker")
    public String smoker() {
        return smoker == "s" ? "Fumante" : "Não Fumante";
    }
}
