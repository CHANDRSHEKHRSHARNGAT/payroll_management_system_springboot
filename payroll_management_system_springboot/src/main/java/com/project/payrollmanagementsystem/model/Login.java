package com.project.payrollmanagementsystem.model;

import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "login")
@Entity(name = "login")

public class Login {

	private long login_id;
	private String login_employee_id;
	private String login_email;
	private String login_password;
	private String login_level_id;

	public Login() {
	}

	public long getLogin_id() {
		return login_id;
	}

	
	public void setLogin_id(long login_id) {
		this.login_id = login_id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String getLogin_employee_id() {
		return login_employee_id;
	}

	public void setLogin_employee_id(String login_employee_id) {
		this.login_employee_id = login_employee_id;
	}

	public String getLogin_email() {
		return login_email;
	}

	public void setLogin_email(String login_email) {
		this.login_email = login_email;
	}

	public String getLogin_password() {
		return login_password;
	}

	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}

	public String getLogin_level_id() {
		return login_level_id;
	}

	public void setLogin_level_id(String login_level_id) {
		this.login_level_id = login_level_id;
	}

	public Login(long login_id, String login_employee_id, String login_email, String login_password,
			String login_level_id) {
		super();
		this.login_id = login_id;
		this.login_employee_id = login_employee_id;
		this.login_email = login_email;
		this.login_password = login_password;
		this.login_level_id = login_level_id;
	}

	@Override
	public String toString() {
		return "Login [login_id=" + login_id + ", login_employee_id=" + login_employee_id + ", login_email="
				+ login_email + ", login_password=" + login_password + ", login_level_id=" + login_level_id + "]";
	}
	
	
}
