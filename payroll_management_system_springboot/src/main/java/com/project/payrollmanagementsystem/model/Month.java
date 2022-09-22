package com.project.payrollmanagementsystem.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "month")
@Entity(name = "month")

public class Month {

	private long month_id;
	private String month_name;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="month")
    private Employee employee;
	
	
	public Month() {
		
	}

	public Month(long month_id, String month_name) {
		super();
		this.month_id = month_id;
		this.month_name = month_name;
	}


	@Override
	public String toString() {
		return "Month [month_id=" + month_id + ", month_name=" + month_name + "]";
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getMonth_id() {
		return month_id;
	}


	public void setMonth_id(long month_id) {
		this.month_id = month_id;
	}


	public String getMonth_name() {
		return month_name;
	}


	public void setMonth_name(String month_name) {
		this.month_name = month_name;
	}
	
}
