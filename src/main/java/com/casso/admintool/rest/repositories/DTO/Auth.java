package com.casso.admintool.rest.repositories.DTO;

public class Auth {
    private String email;
    private String passwordHash;
    private String device_Id;

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return this.passwordHash;
    }
    public void setPasswordHash(String password_hash) {
        this.passwordHash = password_hash;
    }
    
    public String getDeviceId() {
        return this.device_Id;
    }
    public void setDeviceId(String device_Id) {
        this.device_Id = device_Id;
    }

}
