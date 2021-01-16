package cn.edu.huel.owl.service.impl;

import cn.edu.huel.owl.mapper.UserMapper;
import cn.edu.huel.owl.po.Users;
import cn.edu.huel.owl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	/**
	 * 获取用户信息
	 * @param
	 * @return
	 */
	@Override
	public List<Users> getUserList() {
		List<Users> users = userMapper.getUserList();
		return users;
	}
}
