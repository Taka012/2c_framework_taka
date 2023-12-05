package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@Autowired
	JdbcTemplate jdbctemplate;

	//画面表示用(ログイン画面表示)
    @GetMapping("/login")
    public String showRegistrationForm() {
        return "sinki";
    }

//    //DBに問い合わせする用
//    @PostMapping("/login")
//    public String registerUser(String userId,String password) {
//    	
//    	//DBに登録
////    	jdbctemplate.queryforList("SELECT");
//
//        return "sinki";
//    }
}