package ru.itis.rkhasanov.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class SiteUser {
    @NotNull
    @Min(2)
    private String name;
    private String email;
    private String password;

    public SiteUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public SiteUser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
