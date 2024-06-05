package rstyle.softlab.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rstyle.softlab.resume.model.entity.education.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {
}