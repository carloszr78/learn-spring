package com.baeldung.ls;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.baeldung.ls.persistence.model.Project;
import com.baeldung.ls.service.IProjectService;

@SpringBootApplication
public class LsApp {
    
    @Autowired
    IProjectService projectService;

    public static void main(final String... args) {
        SpringApplication.run(LsApp.class, args);
    }

    @PostConstruct
    public void postConstruct() {
        projectService.save(new Project("Mi primer proyecto.", LocalDate.now()));
    }
}
