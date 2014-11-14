package com.socialbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialbook.dao.AdminDAO;
import com.socialbook.entity.Admin;

@Service
public class AdminService {

    @Autowired
    private AdminDAO adminDao;
    
   boolean saveAdmin(final Admin admin) {
		return adminDao.saveAdmin(admin);
	}
	
	Admin findAdmin(int id) {
		return adminDao.findAdmin(id);
	}
	
	boolean updateAdmin(Admin admin) {
		return adminDao.updateAdmin(admin);
	}
	
	boolean removeAdmin(int id) {
		return adminDao.removeAdmin(id);
	}
	
	List<Admin> getAdminByCountry(String country) {
		return adminDao.getAdminByCountry(country);
	}
	
}
