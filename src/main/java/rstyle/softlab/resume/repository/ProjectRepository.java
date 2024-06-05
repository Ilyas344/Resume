package rstyle.softlab.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rstyle.softlab.resume.model.entity.project.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}