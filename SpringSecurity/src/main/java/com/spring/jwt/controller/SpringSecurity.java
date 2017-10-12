package com.spring.jwt.controller;

import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.jwt.model.SpringSampleModel;
import com.spring.jwt.service.SpringService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;




@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
@RequestMapping("/security")
public class SpringSecurity {
	@Autowired
	private SpringService springService;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public SpringSampleModel registerUser(@RequestBody SpringSampleModel model) {
		return springService.save(model);
	}


	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() throws ServletException {
		SpringSampleModel model = new SpringSampleModel();
		model.setEmail("email");
		model.setPassword("pswd");
		String jwtToken = "";

		if (model.getEmail() == null || model.getPassword() == null) {
			throw new ServletException("Please fill in username and password");
		}

		String email = model.getEmail();
		String password = model.getPassword();

		SpringSampleModel smodel = springService.findByEmail(email);

		if (smodel == null) {
			throw new ServletException("User email not found.");
		}

		String pwd = smodel.getPassword();

		if (!password.equals(pwd)) {
			throw new ServletException("Invalid login. Please check your name and password.");
		}

		jwtToken = Jwts.builder().setSubject(email).claim("roles", "model").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();
			System.out.println("The JwtTocken is "+jwtToken);
		return jwtToken;
	}

}
