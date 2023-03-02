package com.BikkadIT.SendingDataUIToController.model;

public class User {

	private String fName;
	private String lName;
	private String email;
	private String uName;
	private String password;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [fName=" + fName + ", lName=" + lName + ", email=" + email + ", uName=" + uName + ", password="
				+ password + "]";
	}

}
