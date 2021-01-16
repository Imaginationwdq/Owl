package cn.edu.huel.owl.controller;

import cn.edu.huel.owl.po.Users;
import cn.edu.huel.owl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/Users")
public class UserController {
	@Autowired
	UserService userService;
	
	//日期转换
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder){
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	//输入id点击查询
	@GetMapping("/list")
	public List<Users> getUserList() {
		List<Users> users = userService.getUserList();
		return users;
	}

	
}
