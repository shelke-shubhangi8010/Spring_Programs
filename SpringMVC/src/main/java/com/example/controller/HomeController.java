package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {

	@RequestMapping("/home")
	public ModelAndView home(Model model)
	{
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("home");
		modelandview.addObject("Name","Shubhangi");
		modelandview.addObject("Id", 101);
		
		
		
		return  modelandview ;
		
	}
}
