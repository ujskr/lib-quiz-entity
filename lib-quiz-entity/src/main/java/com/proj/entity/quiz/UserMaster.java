package com.proj.entity.quiz;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class UserMaster implements Serializable {

	private static final long serialVersionUID = -6722863900844602540L;

	private String userId;
	private String userName;
	private String userPassword;
	private String firstName;
	private String lastName;
	private String emailId;
	private String organisation;
	private String university;
	private String lastLogin;
	private Date dob;
	private UserAddress userAddress;
	private UserRole userRole;

}
