/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elena.dao;

import com.elena.pojo.User;

public interface BaseDao {
 public boolean login(String username, String password);

 public String register(User user);
}
