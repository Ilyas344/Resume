package rstyle.softlab.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rstyle.softlab.resume.model.entity.experience.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}