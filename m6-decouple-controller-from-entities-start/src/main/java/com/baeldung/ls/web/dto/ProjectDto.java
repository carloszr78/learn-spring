package com.baeldung.ls.web.dto;

import java.util.HashSet;
import java.util.Set;

import com.baeldung.ls.persistence.model.Task;

public class ProjectDto {

    private Long id;

    private String name;

    private Set<Task> tasks;
    
    protected ProjectDto() {
    }
    
    public ProjectDto(Long id, String name) {
        this.id = id;
        this.name = name;
        this.tasks = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }
}
