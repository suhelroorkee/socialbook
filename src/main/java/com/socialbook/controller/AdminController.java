package com.socialbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.socialbook.entity.Admin;
import com.socialbook.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	public String saveAdmin(Admin admin){
		return null;

}
	public String findAdmin(int id){
		return null;
		
}
	public String updateAdmin(Admin admin){
		return null;
	}
	public String removeAdmin(int id){
		return null;
	}
	List<Admin> getAdminByCountry(String country) {
		return null;
	}
}