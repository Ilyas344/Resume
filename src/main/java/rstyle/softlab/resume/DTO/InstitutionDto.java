package rstyle.softlab.resume.DTO;

import lombok.Value;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;


@Value
public class InstitutionDto implements Serializable {
    @NotNull
    String name;
    @NotNull
    String address;
    @Pattern(regexp = "^\\+(?:[0-9] ?){6,14}[0-9]$")
    String phone;
    @Email
    String email;
    @URL
    String website;
}