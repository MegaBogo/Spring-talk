package com.dbogo.talk.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dbogo.talk.web.service.MemberService;
import com.dbogo.talk.web.service.UIService;

@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	private UIService uiService;

	@Autowired
	private MemberService memberService;
	
	//@GetMapping("{id}")
	@GetMapping("/index")
	public String index(Model model) {
		
		return "home.index";
		
    }	

}
