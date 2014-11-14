package com.socialbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialbook.dao.UserDAO;
import com.socialbook.entity.Category;
import com.socialbook.entity.SubCategory;
import com.socialbook.entity.UserInfo;

@Service
public class UserInfoService {

	@Autowired
	private UserDAO userDAO;
	
    public boolean saveUser(UserInfo userInfo)throws Exception {
    	return userDAO.saveUser(userInfo);
    			
    }
    
	
	UserInfo findUser (int id)throws Exception {
		return userDAO.findUser(id);
				
	}
	
	
	UserInfo findUserByGroup(int id)throws Exception {
		return userDAO.findUserByGroup(id);
	}
	
	boolean removeUser(int id)throws Exception {
		return userDAO.removeUser(id);
	}
	
	boolean upadateUser(UserInfo userInfo)throws Exception {
		return userDAO.upadateUser(userInfo);
	}
	
    boolean saveCategory(Category category)throws Exception {
		return userDAO.saveCategory(category);
	}
	
	Category findCategory(int id)throws Exception {
		return userDAO.findCategory(id);
	}
	
	boolean updateCategory(Category category)throws Exception {
		return false;
	}
	
	boolean removeCategory(int id)throws Exception {
		return userDAO.removeCategory(id);
	}
	
    boolean saveSubCategory(SubCategory subcategory)throws Exception {
		return userDAO.saveSubCategory(subcategory);
	}
	
	SubCategory findSubCategory(int id)throws Exception {
		return userDAO.findSubCategory(id);
	}
	
	boolean updateSubCategory(SubCategory subcategory)throws Exception {
		return userDAO.updateSubCategory(subcategory);
	}
	
	boolean removeSubCategory(int id)throws Exception {
		return userDAO.removeSubCategory(id);
	}
	
    boolean registerUser(UserInfo userInfo) throws Exception {
		return userDAO.registerUser(userInfo);
	}	
	
	
}
