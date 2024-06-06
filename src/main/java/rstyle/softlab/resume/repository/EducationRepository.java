package rstyle.softlab.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rstyle.softlab.resume.model.education.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {
}