package com.example.HAD.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.HAD.login.bean.LoginBean;

@Component

	
	public interface JpaRepo extends JpaRepository<LoginBean, String> {

		LoginBean findByIdAndPassword(String id, String password);

	}

