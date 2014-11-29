package com.sayuthi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sayuthi.dao.UserDAO;
import com.sayuthi.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	public void addUser(User user) {
		userDAO.addUser(user);
	}

	public void updateUser(User user) {
		userDAO.updateUser(user);
	}

	public User getUser(int id) {
		return userDAO.getUser(id);
	}

	public void deleteUser(int id) {
		userDAO.deleteUser(id);
	}

	public List<User> getUsers() {
		return userDAO.getUsers();
	}

}
