package com.unla.grupo6;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestBCryptPasswordEncoder {
	public static void main(String[] args) {
		BCryptPasswordEncoder pe = new BCryptPasswordEncoder();

		System.out.println(pe.encode("user"));


	}
}
