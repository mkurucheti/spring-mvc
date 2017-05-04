package com.poc.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todoList = new ArrayList<Todo>();
	private static int todoCount = 3;
	
	static{
		todoList.add(new  Todo("mkurucheti", 1, new Date(), false, "hiii"));
		todoList.add(new  Todo("mkurucheti", 2, new Date(), false, "sdfsdadfd"));
		todoList.add(new  Todo("mkurucheti", 3, new Date(), false, "sdfdsffsdfsff"));
	}
	
	public List<Todo> retrieveTodos(String user){
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for(Todo todo:todoList){
			if(todo.getUser().equalsIgnoreCase(user)){
				filteredTodos.add(todo);
			}			
		}
		return filteredTodos;
	}
	
	public void addTodo(String desc){
		todoList.add(new  Todo("mkurucheti", todoCount++, new Date(), false, desc));
	}

}
