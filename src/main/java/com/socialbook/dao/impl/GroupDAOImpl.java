package com.socialbook.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.socialbook.dao.GroupDAO;
import com.socialbook.entity.Group;
import com.socialbook.entity.GroupChat;
import com.socialbook.entity.GroupTag;
@Transactional
@Repository
public class GroupDAOImpl extends HibernateUtil implements GroupDAO {

	@Override
	public boolean saveGroup(Group group) throws Exception {
		 Session session=getCurrentSession();
		 
		 session.save(group);
		 return true;
	}

	@Override
	public Group findGroup(int id) throws Exception {
		  Session session = getCurrentSession();
		  
		  Group group = (Group)session.get(Group.class, id);
		  return group;
	}

	@Override
	public boolean updateGroup(Group group) throws Exception {
		Session session =getCurrentSession();
		session.update(group);
		return true;
	}

	@Override
	public boolean removeGroup(int id) throws Exception {
		boolean removed = false;
		Session session = getCurrentSession();
		Group group =(Group)session.get(Group.class, id);
		if(group!=null){
			group.setStatus("removed");
			session.update(group);
			removed=true;
		}
		return removed;
	}

	@Override
	public List<Group> findByName(String name) throws Exception {
		
         Session session = getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<Group> findByName = session.createQuery("from Group").list();
		
		return findByName;  
	}

	@Override
	public List<Group> findByAuthor(String author) throws Exception {

          Session session = getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<Group> findByAuthor = session.createQuery("from Group").list();
		
		return findByAuthor;
	}

	@Override
	public List<Group> findByBooks(String book) throws Exception {
        Session session = getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<Group> findByBooks = session.createQuery("from Group").list();
		
		return findByBooks;
		
	}

	@Override
	public List<Group> findByUsers(String user) throws Exception {
	        Session session = getCurrentSession();
			
			@SuppressWarnings("unchecked")
			List<Group> findByUsers = session.createQuery("from Group").list();
			
			return findByUsers;
	}

	@Override
	public boolean saveGroupTag(GroupTag grouptag) throws Exception {
		Session session=getCurrentSession();
		
		session.save(grouptag);
		return true;
	}

	@Override
	public GroupTag findGroupTag(int id) throws Exception {
     Session session=getCurrentSession();
     
     GroupTag groupTag=(GroupTag)session.get(GroupTag.class, id);
          return groupTag;
	}

	@Override
	public boolean updateGroupTag(GroupTag grouptag) throws Exception {
		 Session session = getCurrentSession();
		 session.update(grouptag);
		 return true;
	}

	@Override
	public boolean removeGroupTag(int id) throws Exception {
		boolean removed = false;
		Session session=getCurrentSession();
		GroupTag groupTag=(GroupTag)session.get(GroupTag.class, id);
		if(groupTag!=null){
			groupTag.setStatus("removed");
			removed=true;
		}
		
		return removed;
	}

	@Override
	public List<GroupTag> getGroupTagByCategory(String category) throws Exception {
        Session session = getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<GroupTag> GroupTagByCategory = session.createQuery("from GroupTag").list();
		
		return GroupTagByCategory;  
		
	}

	@Override
	public boolean saveGroupChat(GroupChat groupchat) throws Exception {

      Session session=getCurrentSession();
      session.save(groupchat);
      return true;
      
	}

	@Override
	public GroupChat findGroupChat(int id) throws Exception {
		 Session session=getCurrentSession();
		 GroupChat groupChat =(GroupChat)session.get(GroupChat.class, id);
		 return groupChat;
	}

	@Override
	public boolean updateGroupChat(GroupChat groupchat) throws Exception {
		Session session=getCurrentSession();
		session.update(groupchat);
		return true;
	}

	@Override
	public boolean removeGroupChat(int id) throws Exception {
		 boolean removed=false;
		Session session=getCurrentSession();
		
		GroupChat groupChat = (GroupChat)session.get(GroupChat.class, id);
		if(groupChat!=null){
			groupChat.setStatus("removed");
			session.update(groupChat);
			removed=true;
			
		}
		return removed;
	}

	@Override
	public List<GroupChat> getGroupChatByUsers(String users) throws Exception {
		
         Session session = getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<GroupChat> GroupChatByUsers = session.createQuery("from GroupChat").list();
		
		return GroupChatByUsers;  
		
	}

	

	
}