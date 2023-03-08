package com.example.demo.objects;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserCredentials {
    @NotBlank(message = "O e-mail não pode estar em branco")
    @Email(message = "O e-mail informado é inválido")
    private String email;

    @NotBlank(message = "A senha não pode estar em branco")
    private String password;

    // getters e setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

