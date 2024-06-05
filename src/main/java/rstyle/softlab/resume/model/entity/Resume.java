package rstyle.softlab.resume.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rstyle.softlab.resume.model.entity.contact.Contact;
import rstyle.softlab.resume.model.entity.education.Institution;
import rstyle.softlab.resume.model.entity.experience.Experience;
import rstyle.softlab.resume.model.entity.project.Project;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Resume")
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    private Contact contact;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Institution> education;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Experience> experience;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Project> projects;
    private String hobbies;
    private String about;
}
