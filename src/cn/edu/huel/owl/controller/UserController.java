package cn.edu.huel.owl.controller;

import cn.edu.huel.owl.po.Users;
import cn.edu.huel.owl.service.UserService;
import com.sun.deploy.nativesandbox.comm.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@RequestMapping("/game")
	public String game() {
		return "game";
	}
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@RequestMapping("/registerteacher")
	public String registerteacher() {
		return "registerteacher";
	}

	@RequestMapping("/registerIn")
	public String registerIn(Users users, Model model) {

		 if (userService.findByUserName(users) !=null){
             model.addAttribute("alert","注册失败，用户名已存在");
			 return "register";
		 }else
		 {
			 users.setStatus("1");
			 int flag = userService.registerIn(users);
			 if ( flag!=0 ){
				 model.addAttribute("alert","注册成功，名字:"+users.getName());
				 return "login";
			 }else
			 {
				 model.addAttribute("alert","注册失败");
				 return "register";
			 }
		 }

	}

	@RequestMapping("/loginIn")
	public String loginIn(Users user,Model model) {
		if (userService.loginIn(user)){
			model.addAttribute("alert","欢迎登录"+user.getUsername());
			return "index";
		}
		else{
			model.addAttribute("alert","登录失败，账号或密码错误");
			return "login";
		}

	}

}
