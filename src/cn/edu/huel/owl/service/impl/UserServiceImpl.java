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

	/**
	 *  注册
	 * @param user
	 * @return
	 */
	@Override
	public int registerIn(Users user) {
		int flag = userMapper.registerIn(user);
		return flag;
	}

	/**
	 *  注册验证
	 * @param user
	 * @return
	 */
	@Override
	public Users findByUserName(Users user) {
		Users users = userMapper.findUserByUserName(user.getUsername());
		return users;
	}

	/**
	 * 登录验证
	 * @param users
	 * @return
	 */
	@Override
	public boolean loginIn(Users users) {
		Users user = userMapper.loginIn(users.getUsername(),users.getPassword());
		if (user!=null){
			return true;
		}
		else
		return false;
	}
}
