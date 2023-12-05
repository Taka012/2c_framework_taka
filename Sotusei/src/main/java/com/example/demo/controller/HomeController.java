package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String showLoginForm() {
        return "home_x";
    }

    @PostMapping("/login")
    public String login(@RequestParam String id, @RequestParam String pw, Model model) {
        // ログインの条件をチェック
        if ("live".equals(id) && "0726".equals(pw)) {
            // ログイン成功時の処理
            model.addAttribute("message", "ログイン成功！");
            return "keijiban"; // 成功時に表示するページ（success.htmlなど）を作成してください
        } else {
            // ログイン失敗時の処理
            model.addAttribute("error", "IDまたはパスワードが正しくありません");
            return "home_x";
        }
    }
}