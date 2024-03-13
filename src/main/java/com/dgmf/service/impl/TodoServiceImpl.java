package com.dgmf.service.impl;

import com.dgmf.entity.Todo;
import com.dgmf.service.TodoService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    private static List<Todo> todos;

    static {
        todos.add(new Todo(
                1L,
                "johnDoe",
                "Learn AWS",
                LocalDate.now().plusYears(1),
                false)
        );
        todos.add(new Todo(
                1L,
                "johnDoe",
                "Learn DevOps",
                LocalDate.now().plusYears(2),
                false)
        );
        todos.add(new Todo(
                1L,
                "johnDoe",
                "Learn Full Stack Development",
                LocalDate.now().plusYears(3),
                false)
        );
    }

    @Override
    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
