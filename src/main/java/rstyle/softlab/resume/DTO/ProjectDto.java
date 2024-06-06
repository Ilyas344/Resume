package rstyle.softlab.resume.DTO;

import lombok.Value;
import org.hibernate.validator.constraints.URL;

import java.io.Serializable;


@Value
public class ProjectDto implements Serializable {

    String name;

    String description;
    @URL
    String link;
}