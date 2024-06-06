package rstyle.softlab.resume.DTO;

import lombok.Value;
import rstyle.softlab.resume.DTO.CompanyDto;

import java.io.Serializable;
import java.time.LocalDate;


@Value
public class ExperienceDto implements Serializable {
    CompanyDto job;
    LocalDate startDate;
    LocalDate endDate;
    Integer experience;
}