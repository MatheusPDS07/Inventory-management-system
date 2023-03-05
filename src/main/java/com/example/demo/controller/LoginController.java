package com.example.demo.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class LoginController {

    //teste de recebimento de dados
    /*@PostMapping
    public ResponseEntity<String> sendData(@RequestBody Map<String, String> data) {
        System.out.println(" OLHA OS DADOS :"+data.get("string1"));
        System.out.println(" OLHA OS DADOS :"+data.get("string2"));
        return ResponseEntity.ok("Dados enviados com sucesso!"+String.valueOf(data.get("string1")));
    }*/

    @PostMapping
    public ResponseEntity<String> sendData(@RequestBody Map<String, String> data) throws IOException {
        String email = data.get("string1");
        String password = data.get("string2");

        RestTemplate restTemplate = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword")
                .queryParam("key", "AIzaSyB9J_6jk2_uLkfhCwd3wsP1Qq3musB7aWw");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, String> request = new HashMap<>();
        request.put("email", email);
        request.put("password", password);
        request.put("returnSecureToken", "true");

        HttpEntity<Map<String, String>> entity = new HttpEntity<>(request, headers);

        ResponseEntity<String> response = restTemplate.exchange(builder.toUriString(), HttpMethod.POST, entity, String.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            return ResponseEntity.ok("Autenticação bem-sucedida");
        } else {
            // Manipular erros de forma adequada
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao autenticar usuário");
        }
    }
}