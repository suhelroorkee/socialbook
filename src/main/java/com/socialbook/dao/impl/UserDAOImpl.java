package com.socialbook.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.socialbook.dao.UserDAO;
import com.socialbook.entity.Category;
import com.socialbook.entity.SubCategory;
import com.socialbook.entity.UserInfo;

@Transactional
@Repository
public class UserDAOImpl extends HibernateUtil implements UserDAO{

	@Override
	public boolean saveUser(UserInfo userinfo) throws Exception {
		
		Session session = getCurrentSession();
		
		session.save(userinfo);
		return true;
	}

	@Override
	public UserInfo findUser(int id) throws Exception {
	
       Session session = getCurrentSession();
		
		String hql = "from UserInfo as ui where ui.userName=:userName";
		
		Query query = session.createQuery(hql);
		query.setInteger("id", id);
		
		@SuppressWarnings("unchecked")
		List<UserInfo> users = query.list();
		
		return users.isEmpty() ? null : users.get(0);
	}

	@Override
	public UserInfo findUserByGroup(int id) throws Exception {
		
		Session session= getCurrentSession();
		
		UserInfo userInfo = (UserInfo)session.get(UserInfo.class, id);
		
		return userInfo;
		
	}

	@Override
	public boolean removeUser(int id) throws Exception {
		
      Session session = getCurrentSession();
		
		UserInfo userInfo = (UserInfo) session.get(UserInfo.class, id);
		
		if(userInfo != null){
			
			userInfo.setStatus("removed");
			
			session.update(userInfo);
		}
		
		return true;
		
		
	}
	@Override
	public boolean upadateUser(UserInfo userInfo) throws Exception {
		 Session session = getCurrentSession();
		 
		 session.update(userInfo);
		 return true;
	}

	@Override
	public boolean saveCategory(Category category) throws Exception {
	   Session session = getCurrentSession();
	   
	   session.save(category);
	   return true;
	}

	@Override
	public Category findCategory(int id) throws Exception {
		
        Session session= getCurrentSession();
		
		Category category = (Category)session.get(Category.class, id);
		
		return category;
	}

	@Override
	public boolean updateCategory(Category category) throws Exception {
		Session session = getCurrentSession();
		
		session.save(category);
		
		return true;
	}

	@Override
	public boolean removeCategory(int id) throws Exception {

         boolean removed = false;
          
         Session session = getCurrentSession();
         
         Category category =(Category)session.get(Category.class, id);
         if(category!=null){
        	 category.setStatus("removed");
        	 removed=true;
         }
         return removed;
	}

	@Override
	public boolean saveSubCategory(SubCategory subcategory) throws Exception {
		Session session = getCurrentSession();
		
		session.save(subcategory);
	   return true;	
	}

	@Override
	public SubCategory findSubCategory(int id) throws Exception {

         Session session = getCurrentSession();
         
         SubCategory subCategory =(SubCategory)session.get(SubCategory.class, id);
         
         return subCategory;
	}

	@Override
	public boolean updateSubCategory(SubCategory subcategory) throws Exception {
		Session session = getCurrentSession();
		
		session.update(subcategory);
		
		return true;
	}

	@Override
	public boolean removeSubCategory(int id) throws Exception {
         boolean removed =false;
         
         Session session = getCurrentSession();
         SubCategory subCategory =(SubCategory)session.get(SubCategory.class, id);
         if(subCategory!=null){
        	 subCategory.setStatus("removed");
        	   removed=true;
        	 
         }
         return removed;
	}

	@Override
	public boolean isDuplicateUser(String userName) throws Exception {
		Session session = getCurrentSession();
		
		String hql = "from User as ui where ui.userName=:userName";
		
		Query query = session.createQuery(hql);
		query.setString("userName", userName);
		
		@SuppressWarnings("unchecked")
		List<UserInfo> users = query.list();
		
		return !users.isEmpty();
	}

	@Override
	public boolean isValidUser(String userName, String password)
			throws Exception {
        Session session = getCurrentSession();
		
		String hql = "from User as ui where ui.userName=:userName and ui.password=:password";
		
		Query query = session.createQuery(hql);
		query.setString("userName", userName);
		query.setString("password", password);
		
		@SuppressWarnings("unchecked")
		List<UserInfo> users = query.list();
		
		return !users.isEmpty();
	}


	@Override
	public boolean registerUser(UserInfo userInfo) throws Exception {
		Session session = getCurrentSession();
		
		session.save(userInfo);
		return true;
	    
	}

}
