/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dnt.services;

import com.dnt.pojo.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author admin
 */
public interface UserService extends UserDetailsService {
    User getUserByUsername(String username);
}
