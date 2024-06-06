package rstyle.softlab.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rstyle.softlab.resume.model.experience.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}