package com.socialbook.dao;


import com.socialbook.entity.Category;
import com.socialbook.entity.SubCategory;
import com.socialbook.entity.UserInfo;

public interface UserDAO {
	
	boolean saveUser(UserInfo userInfo)throws Exception;
	
	UserInfo findUser (int id)throws Exception;
	
	UserInfo findUserByGroup( int id)throws Exception;
	
	boolean removeUser(int id)throws Exception;
	
	boolean upadateUser(UserInfo userinfo)throws Exception;
	
    boolean saveCategory(Category category)throws Exception;
	
	Category findCategory(int id)throws Exception;
	
	boolean updateCategory(Category category)throws Exception;
	
	boolean removeCategory(int id)throws Exception;
	
    boolean saveSubCategory(SubCategory subcategory)throws Exception;
	
	SubCategory findSubCategory(int id)throws Exception;
	
	boolean updateSubCategory(SubCategory subcategory)throws Exception;
	
	boolean removeSubCategory(int id)throws Exception;
	
    boolean registerUser(UserInfo userinfo) throws Exception;		
	
	boolean isDuplicateUser(String userName) throws Exception;
	
	boolean isValidUser(String userName, String password) throws Exception;			// login
	
}
