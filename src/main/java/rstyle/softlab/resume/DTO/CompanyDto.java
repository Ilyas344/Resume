package rstyle.softlab.resume.DTO;

import lombok.Value;
import rstyle.softlab.resume.model.experience.Company;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * DTO for {@link Company}
 */
@Value
public class CompanyDto implements Serializable {
    @NotNull
    String name;
    @NotNull
    String position;
    @NotNull
    String department;
    @NotNull
    String description;
}