package com.example.capstone1.controller;

import com.example.capstone1.model.request.JwtRequest;
import com.example.capstone1.model.response.JwtResponse;
import com.example.capstone1.service.jwt.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping({"/public/authenticate"})
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest ) throws Exception{
    return jwtService.createJwtToken(jwtRequest);
    }
}
