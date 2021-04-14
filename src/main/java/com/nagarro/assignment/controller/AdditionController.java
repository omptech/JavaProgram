package com.nagarro.assignment.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	@RequestMapping(value="/add")
	public ModelAndView addNumbers(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		double a=Double.parseDouble(request.getParameter("t1"));
		double b=Double.parseDouble(request.getParameter("t2"));
		String op=request.getParameter("t3");
		
        double r=0.0;
        switch(op.charAt(0)) {
        case 'A':
        	r=a+b;
        	break;
        case 'S':
        	r=a-b;
        	break;
        case 'M':
        	r=a*b;
        	break;
        case 'D':
        	r=a/b;
        }
        	
		
		mv.addObject("result",r);
		mv.setViewName("add-result");
		return mv;
	}
	
}
