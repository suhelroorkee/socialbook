package com.socialbook.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.socialbook.dao.AdminDAO;
import com.socialbook.entity.Admin;
@Transactional
@Repository
public class AdminDAOImpl extends HibernateUtil implements AdminDAO {

	@Override
	public boolean saveAdmin(Admin admin) {
      Session session = getCurrentSession();
		
		session.save(admin);
		
		return true;
	}

	@Override
	public Admin findAdmin(int id) {
		
       Session session = getCurrentSession();
		Admin admin =(Admin)session.get(Admin.class, id);
		
		return admin;
		
	}

	@Override
	public boolean updateAdmin(Admin admin) {
       Session session = getCurrentSession();
		
		session.update(admin);
		
		return true;
	}

	@Override
	public boolean removeAdmin(int id) {
		boolean removed=false;
       Session session = getCurrentSession();
       Admin admin=(Admin)session.get(Admin.class, id);
       if(admin!=null){
    	   admin.setStatus("removed");
    	   session.update(admin);
    	   removed=true;
       }
		
       
       return removed;
	}

	@Override
	public List<Admin> getAdminByCountry(String country) {
        Session session = getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<Admin> AdminByCountry = session.createQuery("from Admin").list();
		
		return AdminByCountry;    
	
	}
	
	
}
