/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dnt.repositories;

import com.dnt.pojo.User;

/**
 *
 * @author admin
 */
public interface UserRepository {
    public User getUserByUsername(String username);
}
