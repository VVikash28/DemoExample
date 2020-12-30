package com.cg.pojo;

import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


import org.springframework.format.annotation.DateTimeFormat;


public class Student {
	@Size(min = 3,max = 25)
	private String name;
	@Email(regexp = "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$" ,message = "please enter a valid email address")
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	@Pattern(regexp = "^[6-9]\\d{9}$",message = "Phone no must have 10 digits with the starting letter (6-9)")
	private String phone;
	@Pattern(regexp = "^[1-9]\\d{5}$",message = "ZipCode must have 6 digits with the starting letter (1-9)")
	private String zipcode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", dob=" + dob + ", phone=" + phone + ", zipcode="
				+ zipcode + "]";
	}
	
	
}
