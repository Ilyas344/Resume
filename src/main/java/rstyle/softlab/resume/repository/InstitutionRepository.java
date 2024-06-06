package rstyle.softlab.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rstyle.softlab.resume.model.education.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {
}