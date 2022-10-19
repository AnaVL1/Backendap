/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ap.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Analía
 */
public class JwtDto {

    private String token;
    private String bearer = "Bearer";
    private String nuevoUsuario;
    private Collection<? extends GrantedAuthority> authorities;

    //Constructor
    public JwtDto(String token, String nuevoUsuario, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.nuevoUsuario = nuevoUsuario;
        this.authorities = authorities;
    }
    //Getter & Setter

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNuevoUsuario() {
        return nuevoUsuario;
    }

    public void setNuevoUsuario(String nuevoUsuario) {
        this.nuevoUsuario = nuevoUsuario;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

}
