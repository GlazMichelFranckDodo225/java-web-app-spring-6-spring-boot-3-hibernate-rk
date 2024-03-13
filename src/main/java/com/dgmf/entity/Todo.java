package com.dgmf.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Todo {
    private Long id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean done;
}
