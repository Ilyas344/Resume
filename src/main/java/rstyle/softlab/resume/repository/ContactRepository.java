package rstyle.softlab.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rstyle.softlab.resume.model.entity.contact.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}