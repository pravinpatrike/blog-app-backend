package com.pravin.blog.payloads;

import com.pravin.blog.entities.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private int Id;

    @NotEmpty
    @Size(min=4,message="Username must be of minimum 4 characters")
    private String name;

    @Email(message = "Email address is not valid!")
    private String email;

    @NotEmpty
    @Size(min=3,max=10,message = "Password must be in a range of 3 to 10 characters !")
    //@Pattern(regexp = )
    private String password;

    @NotEmpty
    private String about;

    private Set<RoleDto> roles= new HashSet<>();

}
