package cn.edu.huel.owl.mapper;

import cn.edu.huel.owl.po.Users;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<Users> getUserList();
    int registerIn(Users user);
    Users findUserByUserName(String username);
    Users loginIn(@Param("username") String username, @Param("password") String password);
}