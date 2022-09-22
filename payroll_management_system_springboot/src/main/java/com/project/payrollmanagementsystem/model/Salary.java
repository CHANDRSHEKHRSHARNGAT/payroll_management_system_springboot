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

@Table(name = "salary")
@Entity(name = "salary")

public class Salary {

	private long salary_id;
	private String salary_employee_id;
	private String salary_month;
	private String salary_working_days;
	private String salary_basic;
	private String salary_hra;
	private String salary_mediclaim;
	private String salary_ta;
	private String salary_da;
	private String salary_reimbursement;
	private String salary_ca;
	private String salary_others;
	private String salary_dpf;
	private String salary_dtax;
	private String salary_desc;
	private String salary_total;
	private String salary_dedc;
	
	public Salary(long salary_id, String salary_employee_id, String salary_month, String salary_working_days,
			String salary_basic, String salary_hra, String salary_mediclaim, String salary_ta, String salary_da,
			String salary_reimbursement, String salary_ca, String salary_others, String salary_dpf, String salary_dtax,
			String salary_desc, String salary_total, String salary_dedc) {
		super();
		this.salary_id = salary_id;
		this.salary_employee_id = salary_employee_id;
		this.salary_month = salary_month;
		this.salary_working_days = salary_working_days;
		this.salary_basic = salary_basic;
		this.salary_hra = salary_hra;
		this.salary_mediclaim = salary_mediclaim;
		this.salary_ta = salary_ta;
		this.salary_da = salary_da;
		this.salary_reimbursement = salary_reimbursement;
		this.salary_ca = salary_ca;
		this.salary_others = salary_others;
		this.salary_dpf = salary_dpf;
		this.salary_dtax = salary_dtax;
		this.salary_desc = salary_desc;
		this.salary_total = salary_total;
		this.salary_dedc = salary_dedc;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getSalary_id() {
		return salary_id;
	}

	public void setSalary_id(long salary_id) {
		this.salary_id = salary_id;
	}

	public String getSalary_employee_id() {
		return salary_employee_id;
	}

	public void setSalary_employee_id(String salary_employee_id) {
		this.salary_employee_id = salary_employee_id;
	}

	public String getSalary_month() {
		return salary_month;
	}

	public void setSalary_month(String salary_month) {
		this.salary_month = salary_month;
	}

	public String getSalary_working_days() {
		return salary_working_days;
	}

	public void setSalary_working_days(String salary_working_days) {
		this.salary_working_days = salary_working_days;
	}

	public String getSalary_basic() {
		return salary_basic;
	}

	public void setSalary_basic(String salary_basic) {
		this.salary_basic = salary_basic;
	}

	public String getSalary_hra() {
		return salary_hra;
	}

	public void setSalary_hra(String salary_hra) {
		this.salary_hra = salary_hra;
	}

	public String getSalary_mediclaim() {
		return salary_mediclaim;
	}

	public void setSalary_mediclaim(String salary_mediclaim) {
		this.salary_mediclaim = salary_mediclaim;
	}

	public String getSalary_ta() {
		return salary_ta;
	}

	public void setSalary_ta(String salary_ta) {
		this.salary_ta = salary_ta;
	}

	public String getSalary_da() {
		return salary_da;
	}

	public void setSalary_da(String salary_da) {
		this.salary_da = salary_da;
	}

	public String getSalary_reimbursement() {
		return salary_reimbursement;
	}

	public void setSalary_reimbursement(String salary_reimbursement) {
		this.salary_reimbursement = salary_reimbursement;
	}

	public String getSalary_ca() {
		return salary_ca;
	}

	public void setSalary_ca(String salary_ca) {
		this.salary_ca = salary_ca;
	}

	public String getSalary_others() {
		return salary_others;
	}

	public void setSalary_others(String salary_others) {
		this.salary_others = salary_others;
	}

	public String getSalary_dpf() {
		return salary_dpf;
	}

	public void setSalary_dpf(String salary_dpf) {
		this.salary_dpf = salary_dpf;
	}

	public String getSalary_dtax() {
		return salary_dtax;
	}

	public void setSalary_dtax(String salary_dtax) {
		this.salary_dtax = salary_dtax;
	}

	public String getSalary_desc() {
		return salary_desc;
	}

	public void setSalary_desc(String salary_desc) {
		this.salary_desc = salary_desc;
	}

	public String getSalary_total() {
		return salary_total;
	}

	public void setSalary_total(String salary_total) {
		this.salary_total = salary_total;
	}

	public String getSalary_dedc() {
		return salary_dedc;
	}

	public void setSalary_dedc(String salary_dedc) {
		this.salary_dedc = salary_dedc;
	}

	public Salary() {
		
	}
	
	
}
