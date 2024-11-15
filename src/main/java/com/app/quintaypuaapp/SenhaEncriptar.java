package com.app.quintaypuaapp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; 
import org.springframework.security.crypto.password.PasswordEncoder;

public class SenhaEncriptar {

    private static PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
     public static int encriptar(int senha) { return passwordEncoder.hashCode(); } }
    

