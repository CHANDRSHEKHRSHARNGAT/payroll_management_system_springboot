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

@Table(name = "employee")
@Entity(name = "employee")

public class Employee {

	private long employee_id;
	private String employee_sal;
	private String employee_first_name;
	private String employee_middle_name;
	private String employee_last_name;
	private String employee_gender;
	private String employee_address;
	private String employee_village;
	private String employee_state;
	private String employee_country;
	private String employee_landline;
	private String employee_mobile;
	private String employee_email;
	private String employee_status;
	private String employee_department;
	private String employee_dob;
	private String employee_nationalty;
	
	public Employee() {
		
	}
	
	public Employee(long employee_id, String employee_sal, String employee_first_name, String employee_middle_name,
			String employee_last_name, String employee_gender, String employee_address, String employee_village,
			String employee_state, String employee_country, String employee_landline, String employee_mobile,
			String employee_email, String employee_status, String employee_department, String employee_dob,
			String employee_nationalty) {
		super();
		this.employee_id = employee_id;
		this.employee_sal = employee_sal;
		this.employee_first_name = employee_first_name;
		this.employee_middle_name = employee_middle_name;
		this.employee_last_name = employee_last_name;
		this.employee_gender = employee_gender;
		this.employee_address = employee_address;
		this.employee_village = employee_village;
		this.employee_state = employee_state;
		this.employee_country = employee_country;
		this.employee_landline = employee_landline;
		this.employee_mobile = employee_mobile;
		this.employee_email = employee_email;
		this.employee_status = employee_status;
		this.employee_department = employee_department;
		this.employee_dob = employee_dob;
		this.employee_nationalty = employee_nationalty;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_sal() {
		return employee_sal;
	}

	public void setEmployee_sal(String employee_sal) {
		this.employee_sal = employee_sal;
	}

	public String getEmployee_first_name() {
		return employee_first_name;
	}

	public void setEmployee_first_name(String employee_first_name) {
		this.employee_first_name = employee_first_name;
	}

	public String getEmployee_middle_name() {
		return employee_middle_name;
	}

	public void setEmployee_middle_name(String employee_middle_name) {
		this.employee_middle_name = employee_middle_name;
	}

	public String getEmployee_last_name() {
		return employee_last_name;
	}

	public void setEmployee_last_name(String employee_last_name) {
		this.employee_last_name = employee_last_name;
	}

	public String getEmployee_gender() {
		return employee_gender;
	}

	public void setEmployee_gender(String employee_gender) {
		this.employee_gender = employee_gender;
	}

	public String getEmployee_address() {
		return employee_address;
	}

	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}

	public String getEmployee_village() {
		return employee_village;
	}

	public void setEmployee_village(String employee_village) {
		this.employee_village = employee_village;
	}

	public String getEmployee_state() {
		return employee_state;
	}

	public void setEmployee_state(String employee_state) {
		this.employee_state = employee_state;
	}

	public String getEmployee_country() {
		return employee_country;
	}

	public void setEmployee_country(String employee_country) {
		this.employee_country = employee_country;
	}

	public String getEmployee_landline() {
		return employee_landline;
	}

	public void setEmployee_landline(String employee_landline) {
		this.employee_landline = employee_landline;
	}

	public String getEmployee_mobile() {
		return employee_mobile;
	}

	public void setEmployee_mobile(String employee_mobile) {
		this.employee_mobile = employee_mobile;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	public String getEmployee_status() {
		return employee_status;
	}

	public void setEmployee_status(String employee_status) {
		this.employee_status = employee_status;
	}

	public String getemployee_department() {
		return employee_department;
	}

	public void setemployee_department(String employee_department) {
		this.employee_department = employee_department;
	}

	public String getEmployee_dob() {
		return employee_dob;
	}

	public void setEmployee_dob(String employee_dob) {
		this.employee_dob = employee_dob;
	}

	public String getEmployee_nationalty() {
		return employee_nationalty;
	}

	public void setEmployee_nationalty(String employee_nationalty) {
		this.employee_nationalty = employee_nationalty;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_sal=" + employee_sal + ", employee_first_name="
				+ employee_first_name + ", employee_middle_name=" + employee_middle_name + ", employee_last_name="
				+ employee_last_name + ", employee_gender=" + employee_gender + ", employee_address=" + employee_address
				+ ", employee_village=" + employee_village + ", employee_state=" + employee_state
				+ ", employee_country=" + employee_country + ", employee_landline=" + employee_landline
				+ ", employee_mobile=" + employee_mobile + ", employee_email=" + employee_email + ", employee_status="
				+ employee_status + ", employee_department=" + employee_department + ", employee_dob=" + employee_dob
				+ ", employee_nationalty=" + employee_nationalty + "]";
	}
}
