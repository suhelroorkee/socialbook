package com.socialbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.socialbook.entity.SuperAdmin;
import com.socialbook.service.SuperAdminService;

@Controller
public class SuperAdminController {
	@Autowired
	private SuperAdminService superadmin;
	public String saveSuperAdmin(SuperAdmin superadmin){
		return null;

}
}