package com.bsn.book.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "cannot be empty")
    @NotBlank(message = "cannot be empty")
    private String firstName;
    @NotEmpty(message = "cannot be empty")
    @NotBlank(message = "cannot be empty")
    private String lastName;
    @Email(message = "should be correct format")
    @NotEmpty(message = "cannot be empty")
    @NotBlank(message = "cannot be empty")
    private String email;
    @NotEmpty(message = "cannot be empty")
    @NotBlank(message = "cannot be empty")
    @Size(min = 8,message = "password should be long minimum 8 characters")
    private String password;
}
