package com.proj.entity.quiz;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserRole implements Serializable {

	private static final long serialVersionUID = -3518707560730209484L;
	
	private String userRoleId;
	private String userRole;
}
