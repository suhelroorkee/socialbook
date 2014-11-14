package com.socialbook.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.socialbook.entity.Admin;
import com.socialbook.entity.Category;
import com.socialbook.entity.SubCategory;
import com.socialbook.entity.UserInfo;
import com.socialbook.service.UserInfoService;

@Controller
public class UserInfoController {
	@Autowired
	private UserInfoService service;
	
	@RequestMapping("/userinfo")
	public String saveUserInfo(ModelMap map){
map.addAttribute("userInfo", new UserInfo());
		
		return "save";

}
	
	@RequestMapping("/register")
	public String register(){
		
		return "save";
	}
	public String findUser (int id)throws Exception {
		return null;
	}
	
	public String findByGroup( int id)throws Exception {
		return null;
	}
	
	public String removeUser(int id)throws Exception {
		return null;
	}
	
	public String upadateUser(User user)throws Exception {
		return null;
	}
	
	List<User> GetuserByCountry(String country)throws Exception {
		return null;
	}
	
	public String saveCategory(Category category)throws Exception {
		return null;
	}
	
	public String findCategory(int id)throws Exception {
		return null;
	}
	
	public String updateCategory(Category category)throws Exception {
		return null;
	}
	
	public String removeCategory(int id)throws Exception {
		return null;
	}
	
	List<Admin> getCategoryByCountry(String country)throws Exception {
		return null;
	}
	
	public String saveSubCategory(SubCategory subcategory)throws Exception {
		return null;
	}
	
	public String findSubCategory(int id)throws Exception {
		return null;
	}
	
	public String updateSubCategory(SubCategory subcategory)throws Exception {
		return null;
	}
	
	public String removeSubCategory(int id)throws Exception {
		return null;
	}
	
	List<Admin> getSubCategoryByCountry(String country)throws Exception {
		return null;
	}
	
	public String registerUser(User user) throws Exception {
		return null;
	}
}