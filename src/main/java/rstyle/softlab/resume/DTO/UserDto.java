package rstyle.softlab.resume.DTO;

import lombok.Value;

import java.io.Serializable;


@Value
public class UserDto implements Serializable {
    String username;
    String password;
}