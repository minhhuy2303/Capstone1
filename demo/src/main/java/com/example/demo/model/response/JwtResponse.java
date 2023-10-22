package com.example.demo.model.response;

import com.example.demo.model.Account;
import com.example.demo.model.AccountRole;
import com.example.demo.model.Role;
import org.springframework.security.core.userdetails.User;

public class JwtResponse {

    private Account user;
    private Role role;
    private String jwtToken;


    public JwtResponse(Account user, Role role, String jwtToken) {
        this.user = user;
        this.role = role;
        this.jwtToken = jwtToken;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Account getUser() {
        return user;
    }

    public void setUser(Account user) {
        this.user = user;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
