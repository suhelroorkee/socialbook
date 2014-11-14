package com.socialbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.socialbook.entity.Group;
import com.socialbook.entity.GroupChat;
import com.socialbook.entity.GroupTag;
import com.socialbook.service.GroupService;

@Controller
public class GroupController {
	@Autowired
	private GroupService groupservice;
	public String saveGroup(Group group){
		return null; 
}
    public String findGroup(int id) {
		return null;
	}
	
    public String updateGroup(Group group) {
		return null;
	}
	
    public String removeGroup(int id) {
		return null;
	}
	
    public String findByUser(int id) {
		return null;
	}
	
	List<Group> findByAuthor(String author) {
		return null;
	}
	
	
	public String saveGroupTag(GroupTag grouptag) {
		return null;
	}
	
	public String findGroupTag(int id) {
		return null;
	}

	public String updateGroupTag(GroupTag grouptag) {
		return null;
	}

	public String removeGroupTag(int id) {
		return null;
	}

	List<GroupTag> GetgrouptagByCategory(String category) {
		return null;
	}
	
	
	public String saveGroupChat(GroupChat groupchat) {
		return null;
	}
	
	public String findGroupChat(int id) {
		return null;
	}
	
	public String updateGroupChat(GroupChat groupchat) {
		return null;
	}
	
	public String removeGroupChat(int id) {
		return null;
	}
	
    List<GroupChat> GetGroupChatByUsers(String users) {
		return null;
	}
}