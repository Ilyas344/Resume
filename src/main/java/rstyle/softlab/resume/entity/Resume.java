package rstyle.softlab.resume.entity;

import rstyle.softlab.resume.entity.experience.Experience;
import rstyle.softlab.resume.entity.education.Institution;

import java.util.List;
import java.util.UUID;

public class Resume {

    private UUID id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private List<Institution> education;
    private List<Experience> experience;
    private String skills;
    private String hobbies;
    private String about;
}
