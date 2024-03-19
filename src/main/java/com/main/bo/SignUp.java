package com.main.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "signupdata")
public class SignUp {
	@Id
	private String uid;
	private String uname;
	private String email;
	private String password;
	private String mob;

	public SignUp() {
		System.out.println("SignUp obj created.........!");
	}

	public SignUp(String uid, String uname, String email, String password, String mob) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
		this.password = password;
		this.mob = mob;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

}
