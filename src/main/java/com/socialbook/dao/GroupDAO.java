package com.socialbook.dao;
import java.util.List;

import com.socialbook.entity.Group;
import com.socialbook.entity.GroupChat;
import com.socialbook.entity.GroupTag;

public interface GroupDAO {
	
	boolean saveGroup(Group group)throws Exception;
	
	Group findGroup(int id)throws Exception;
	
	boolean updateGroup(Group group)throws Exception;
	
	boolean removeGroup(int id)throws Exception;
	
	List<Group> findByName(String name)throws Exception;
	
	List<Group> findByAuthor(String author)throws Exception;
	
	List<Group> findByBooks(String book)throws Exception;
	
	List<Group> findByUsers(String user)throws Exception;
	
	
	
	boolean saveGroupTag(GroupTag grouptag)throws Exception;
	
	GroupTag findGroupTag(int id)throws Exception;

	boolean updateGroupTag(GroupTag grouptag)throws Exception;

	boolean removeGroupTag(int id)throws Exception;

	List<GroupTag> getGroupTagByCategory(String category)throws Exception;
	
	
    boolean saveGroupChat(GroupChat groupchat)throws Exception;
	
	GroupChat findGroupChat(int id)throws Exception;
	
	boolean updateGroupChat(GroupChat groupchat)throws Exception;
	
	boolean removeGroupChat(int id)throws Exception;
	
    List<GroupChat> getGroupChatByUsers(String users)throws Exception;
	

}
