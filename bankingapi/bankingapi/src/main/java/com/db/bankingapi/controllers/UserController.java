package com.db.bankingapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private RestClient restClient;

    @GetMapping("/v1.0")
    public ResponseEntity<?> getUsers(){
        String response=restClient.get().uri("https://jsonplaceholder.typicode.com/users")
                .retrieve()
                .body(String.class);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }


}
