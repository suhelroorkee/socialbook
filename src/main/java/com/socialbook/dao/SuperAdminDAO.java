package com.socialbook.dao;
import com.socialbook.entity.SuperAdmin;

    public interface SuperAdminDAO {
	
    boolean saveSuperAdmin(SuperAdmin superadmin)throws Exception;
	
	SuperAdmin findSuperAdmin(int id)throws Exception;
	
	boolean updateSuperAdmin(SuperAdmin superadmin)throws Exception;
	
	boolean removeSuperAdmin(int id) throws Exception;

}
