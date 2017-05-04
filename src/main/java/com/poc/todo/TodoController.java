package com.poc.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value="/listtodos", method=RequestMethod.GET)
	public String getTodoList(ModelMap model){
		model.addAttribute("todos", todoService.retrieveTodos("mkurucheti"));
		return "list-todos";		
	}

}
