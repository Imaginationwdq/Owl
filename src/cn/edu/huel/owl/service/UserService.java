package cn.edu.huel.owl.service;

import cn.edu.huel.owl.po.Users;

import java.util.List;

public interface UserService {

    List<Users> getUserList();
    int registerIn(Users user);
    Users findByUserName(Users user);
    boolean loginIn(Users users);
}
