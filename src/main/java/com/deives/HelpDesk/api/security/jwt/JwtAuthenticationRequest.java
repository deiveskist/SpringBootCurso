package com.deives.HelpDesk.api.security.jwt;

import java.io.Serializable;

public class JwtAuthenticationRequest implements Serializable {

    private static final long serialVersionID = 1L;

    private String email;
    private String password;

    public JwtAuthenticationRequest(){
        super();
    }

    public JwtAuthenticationRequest(String email,String password){
        this.setEmail(email);
        this.setPassword(password);


    }

    private void setPassword(String password)
    {
        this.password = password;
    }

    public void setEmail(String email)
    {
        this.email =email;
    }

    public String getPassword()
    {
        return this.password;
    }

    public String getEmail(){
        return this.email;
    }




}
