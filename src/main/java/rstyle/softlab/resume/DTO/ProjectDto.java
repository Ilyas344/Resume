package rstyle.softlab.resume.DTO;

import lombok.Value;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Value
public class ProjectDto implements Serializable {
    @NotNull
    String name;
    @NotNull
    String description;
    @URL
    String link;
}