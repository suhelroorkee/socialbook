package com.socialbook.dao.impl;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.socialbook.dao.SuperAdminDAO;
import com.socialbook.entity.SuperAdmin;

@Transactional
@Repository
public class SuperAdminDAOImpl extends HibernateUtil implements SuperAdminDAO{

	@Override
	public boolean saveSuperAdmin(SuperAdmin superadmin) {
		Session session= getCurrentSession();
		
		session.save(superadmin);
		return true;
				
	}

	@Override
	public SuperAdmin findSuperAdmin(int id) {
		Session session = getCurrentSession();
		 SuperAdmin superAdmin =(SuperAdmin)session.get(SuperAdmin.class, id);
		  
		 return superAdmin;
	}

	@Override
	public boolean updateSuperAdmin(SuperAdmin superadmin) {
		Session session=getCurrentSession();
		session.update(superadmin);
		
		return true;
	}

	@Override
	public boolean removeSuperAdmin(int id) {
		boolean removed=false;
		Session session = getCurrentSession();
		SuperAdmin superAdmin =(SuperAdmin)session.get(SuperAdmin.class, id);
		if(superAdmin!=null){
		  superAdmin.setStatus("removed");
		  session.update(superAdmin);
			removed=true;
	}
		return removed;
		
	}		
	

}