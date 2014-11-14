package com.socialbook.dao;

import java.util.List;

import org.apache.catalina.User;

import com.socialbook.entity.Admin;
import com.socialbook.entity.Category;
import com.socialbook.entity.SubCategory;
import com.socialbook.entity.UserInfo;

public interface UserInfoDAO {
	
	boolean saveUser(UserInfo userinfo)throws Exception;
	
	boolean findUser (int id)throws Exception;
	
	boolean findByGroup( int id)throws Exception;
	
	boolean removeUser(int id)throws Exception;
	
	boolean upadateUser(User user)throws Exception;
	
	List<User> GetuserByCountry(String country)throws Exception;
	
    boolean saveCategory(Category category)throws Exception;
	
	boolean findCategory(int id)throws Exception;
	
	boolean updateCategory(Category category)throws Exception;
	
	boolean removeCategory(int id)throws Exception;
	
	List<Admin> getCategoryByCountry(String country)throws Exception;
	
    boolean saveSubCategory(SubCategory subcategory)throws Exception;
	
	boolean findSubCategory(int id)throws Exception;
	
	boolean updateSubCategory(SubCategory subcategory)throws Exception;
	
	boolean removeSubCategory(int id)throws Exception;
	
	List<Admin> getSubCategoryByCountry(String country)throws Exception;
	
    boolean registerUser(User user) throws Exception;	
	
}
