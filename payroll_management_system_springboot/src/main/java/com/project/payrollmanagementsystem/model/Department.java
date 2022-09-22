package com.project.payrollmanagementsystem.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "department")
@Entity(name = "department")

public class Department {

	private long department_id;
	private String department_name;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="department")
    private Employee employee;
	
	
	public Department() {
		
	}

	public Department(long department_id, String department_name) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
	}


	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", department_name=" + department_name + "]";
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getDepartment_id() {
		return department_id;
	}


	public void setDepartment_id(long department_id) {
		this.department_id = department_id;
	}


	public String getDepartment_name() {
		return department_name;
	}


	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	
}
