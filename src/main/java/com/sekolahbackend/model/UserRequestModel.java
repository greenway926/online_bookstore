package com.sekolahbackend.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sekolahbackend.util.FieldsValueMatch;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@FieldsValueMatch.List({ 
    @FieldsValueMatch(
      field = "password", 
      fieldMatch = "verifyPassword", 
      message = "password fields must match!"
    )
})
public class UserRequestModel {

	@NotBlank
	private String username;
	
	@NotBlank
	private String fullName;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	@Pattern(regexp = "(^[0-9]+$|^$)", message = "number only")
	private String phoneNumber;
	
	@NotBlank
	private String address;
	
	@NotBlank
	private String password;

	@NotBlank
	private String verifyPassword;
}
