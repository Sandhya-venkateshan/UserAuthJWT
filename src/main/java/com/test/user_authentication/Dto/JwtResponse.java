package com.test.user_authentication.Dto;

import java.util.List;

public class JwtResponse {

    public JwtResponse(Long id, String username, String email, List roles) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }

    private Long id;
    private String username;
    private String email;
    private List roles;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List getRoles() {
        return roles;
    }

    public void setRoles(List roles) {
        this.roles = roles;
    }
}
