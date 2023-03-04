package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class LoginController {
    @PostMapping
    public ResponseEntity<String> sendData(@RequestBody Map<String, String> data) {
        System.out.println(" OLHA OS DADOS :"+data.get("string1"));
        System.out.println(" OLHA OS DADOS :"+data.get("string2"));
        return ResponseEntity.ok("Dados enviados com sucesso!"+String.valueOf(data.get("string1")));
    }
}