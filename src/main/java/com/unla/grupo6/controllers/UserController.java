package com.unla.grupo6.controllers;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.unla.grupo6.helpers.ViewRouterHelper;



@Controller
public class UserController {
	
	@GetMapping("/login")
	public String login(Model model, @RequestParam(name="error", required=false) String error, @RequestParam(name="logout", required = false) String logout) {
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		
		return ViewRouterHelper.USER_LOGIN;
	}
	
	@GetMapping("/logout")
	public String logout (Model model) {
		return ViewRouterHelper.USER_LOGOUT;
	}
	
	@GetMapping("/loginsuccess")
	public String loginCheck() {
		return "redirect:/index";
	}
	
//	public class TestByCryptPasswordEncoder{
//		public static void main(String[] args) {
//			BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
//			System.out.println(pe.encode("user"));
//		}
//	}
}