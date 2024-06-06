package rstyle.softlab.resume.DTO;

import lombok.Value;

import java.io.Serializable;
import java.util.List;


@Value
public class ResumeDto implements Serializable {
    String name;
    List<EducationDto> education;
    List<ExperienceDto> experience;
    List<ProjectDto> projects;

}