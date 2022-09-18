package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getListByCity(String city) {
		List<User> list=userRepository.findByCity(city);
		return list;
	}
}
