package ecorau.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ecorau.shop.entities.User;
import ecorau.shop.service.UserService;

@RestController
@RequestMapping("/shop")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/get-all-user")
	public List<User> findAll() {
		return userService.findAllUser();
	}
}
