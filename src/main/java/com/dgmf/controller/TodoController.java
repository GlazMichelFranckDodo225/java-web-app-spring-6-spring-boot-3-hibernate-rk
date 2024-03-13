package com.dgmf.controller;

import com.dgmf.entity.Todo;
import com.dgmf.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @RequestMapping("/list-todos")
    public String listAllTodos(ModelMap modelMap) {
        List<Todo> todos = todoService.findByUsername("johnDoe");
        modelMap.addAttribute("todos", todos);

        return "list_todos";
    }
}
