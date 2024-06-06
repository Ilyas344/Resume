package rstyle.softlab.resume.DTO;

import lombok.Value;
import rstyle.softlab.resume.model.education.Institution;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;


@Value
public class EducationDto implements Serializable {
    @NotNull
    Boolean isGraduated;
    LocalDate startDate;
    LocalDate endDate;
    Institution institution;
}