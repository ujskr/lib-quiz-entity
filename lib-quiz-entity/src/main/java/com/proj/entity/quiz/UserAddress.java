package com.proj.entity.quiz;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserAddress implements Serializable{

	private static final long serialVersionUID = -1746427276488877496L;
	
	private String addressId;
	private String addressLine1;
	private String area;
	private String city;
	private String state;
	private int pinCode;

}
