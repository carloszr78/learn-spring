package com.baeldung.ls.persistence.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.baeldung.ls.persistence.model.Project;

public interface IProjectRepository extends CrudRepository<Project, Long> {

//    Optional<Project> findById(Long id);
//
//    Project save(Project project);
}
