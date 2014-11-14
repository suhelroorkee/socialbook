package com.socialbook.dao;

import java.util.List;

import com.socialbook.entity.Admin;

public interface AdminDAO {
	
	boolean saveAdmin(Admin admin);
	
	Admin findAdmin(int id);
	
	boolean updateAdmin(Admin admin);
	
	boolean removeAdmin(int id);
	
	List<Admin> getAdminByCountry(String country);
	

}
