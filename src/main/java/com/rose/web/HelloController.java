package com.rose.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("title", "Practice");
		model.addAttribute("message", "this message was sent by Controller");
		return "helo";
	}
}
