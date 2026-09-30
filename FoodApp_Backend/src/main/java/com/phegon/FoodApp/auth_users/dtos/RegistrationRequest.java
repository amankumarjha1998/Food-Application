package com.phegon.FoodApp.auth_users.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class RegistrationRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "password is required")
    @Size(min = 3,message = "Password must be atleast 3 characters long")
    private String password;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "phone number is required")
    private String phoneNumber;

    private List<String> roles;


}
