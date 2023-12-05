package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SinkiController {
	
	@Autowired
	JdbcTemplate jdbctemplate;

	//画面表示用
    @GetMapping("/sinki")
    public String showRegistrationForm() {
        return "sinki";
    }

    //DBに登録する用
    @PostMapping("/sinki")
    public String registerUser(String userId,String password,Model model) {
    	
    	//DBに登録
    	jdbctemplate.update("INSERT INTO sotu (user_id,password) VALUES(?,?)",userId,password);
    	 model.addAttribute("message", "登録成功！");
        return "sinki_x";
    }
}