package com.example.HAD.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.HAD.login.bean.LoginBean;
import com.example.HAD.login.service.LoginServiceImpl;

@RestController
public class LoginController {
	

	
	

	    @Autowired
	    LoginServiceImpl Loginservice;

	    @CrossOrigin (origins = "*")
	    @PostMapping("/login")
	    public String login (@RequestBody LoginBean object){
	    return Loginservice.login(object);
	    }
	

}
