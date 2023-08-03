package net.javaguides.sms.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class StudentDto {
                                         //this class acts as a model view class between controller and view layer.
    private long id;
    @NotEmpty(message="firstname should not be empty")
    private String firstName;
    @NotEmpty(message = "last name should not be empty")   //Not Empty and Email are validation springboot annotations to check valid email and particular column not empty.
    private String lastName;
    @Email
    private String email;
}
