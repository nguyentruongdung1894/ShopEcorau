package ecorau.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecorau.shop.entities.User;
import ecorau.shop.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

}
