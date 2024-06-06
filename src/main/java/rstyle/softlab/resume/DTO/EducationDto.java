package rstyle.softlab.resume.DTO;

import lombok.Value;
import rstyle.softlab.resume.model.education.Institution;

import java.io.Serializable;
import java.time.LocalDate;


@Value
public class EducationDto implements Serializable {

    Boolean isGraduated;
    LocalDate startDate;
    LocalDate endDate;
    Institution institution;
}