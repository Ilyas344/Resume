package rstyle.softlab.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rstyle.softlab.resume.model.entity.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}