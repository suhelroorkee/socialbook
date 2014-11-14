package com.socialbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialbook.dao.GroupDAO;
import com.socialbook.entity.Group;
import com.socialbook.entity.GroupChat;
import com.socialbook.entity.GroupTag;

@Service
public class GroupService {
	
   @Autowired
   private GroupDAO groupDao;
   
	boolean saveGroup(Group group) throws Exception{
		return groupDao.saveGroup(group);
	}
	
	Group findGroup(int id) throws Exception{
		return groupDao.findGroup(id);
	}
	
	boolean updateGroup(Group group) throws Exception{
		return groupDao.updateGroup(group);
	}
	
	boolean removeGroup(int id) throws Exception{
		return groupDao.removeGroup(id);
	}
	
	List<Group> findByName(String name)throws Exception{
		return groupDao.findByName(name);
	}
	List<Group> findByBooks(String book)throws Exception{
		return groupDao.findByBooks(book);
	}
	List<Group> findByUsers(String user) throws Exception{
		return groupDao.findByUsers(user);
	}
	
	List<Group> findByAuthor(String author) throws Exception{
		return groupDao.findByAuthor(author);
	}
	
	
	boolean saveGroupTag(GroupTag grouptag) throws Exception{
		return groupDao.saveGroupTag(grouptag);
	}
	
	GroupTag findGroupTag(int id) throws Exception{
		return groupDao.findGroupTag(id);
	}

	boolean updateGroupTag(GroupTag grouptag) throws Exception{
		return groupDao.updateGroupTag(grouptag);
	}

	boolean removeGroupTag(int id) throws Exception{
		return groupDao.removeGroupTag(id);
	}

	List<GroupTag> GetgrouptagByCategory(String category) throws Exception{
		return groupDao.getGroupTagByCategory(category);
	}
	
	
    boolean saveGroupChat(GroupChat groupchat) throws Exception{
		return groupDao.saveGroupChat(groupchat);
	}
	
	GroupChat findGroupChat(int id) throws Exception{
		return groupDao.findGroupChat(id);
	}
	
	boolean updateGroupChat(GroupChat groupchat) throws Exception{
		return groupDao.updateGroupChat(groupchat);
	}
	
	boolean removeGroupChat(int id) throws Exception{
		return groupDao.removeGroupChat(id);
	}
	
    List<GroupChat> getGroupChatByUsers(String users) throws Exception{
		return groupDao.getGroupChatByUsers(users);
	}
	


}
