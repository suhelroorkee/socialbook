package com.socialbook.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.socialbook.entity.UserInfo;
import com.socialbook.service.UserInfoService;


@Controller
public class IndexController {

	@Autowired
	private UserInfoService userService;
	
	public String saveUserInfo(UserInfo userinfo)throws Exception{
		
		userService.saveUser(userinfo);
		
		return "save.jsp";
	}
}
