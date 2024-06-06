package rstyle.softlab.resume.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rstyle.softlab.resume.model.education.Education;
import rstyle.softlab.resume.model.experience.Experience;
import rstyle.softlab.resume.model.project.Project;

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
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "resume")
    private List<Education> education;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "resume")
    private List<Experience> experience;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "resume")
    private List<Project> projects;
}
