package com.socialbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialbook.dao.SuperAdminDAO;
import com.socialbook.entity.SuperAdmin;

@Service
public class SuperAdminService {

	@Autowired
	private SuperAdminDAO superAdminDAO;
	
	 boolean saveSuperAdmin(SuperAdmin superadmin)throws Exception{
		 return superAdminDAO.saveSuperAdmin(superadmin);
	 }
	
	 SuperAdmin findSuperAdmin(int id)throws Exception{
		 return superAdminDAO.findSuperAdmin(id);
		 
	 }
	boolean updateSuperAdmin(SuperAdmin superadmin) throws Exception{
		return superAdminDAO.updateSuperAdmin(superadmin);
	}
	
	boolean removeSuperAdmin(int id) throws Exception{
		return superAdminDAO.removeSuperAdmin(id);
	}
	
}
