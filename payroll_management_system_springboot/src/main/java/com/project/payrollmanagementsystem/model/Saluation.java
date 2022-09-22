package com.project.payrollmanagementsystem.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "saluation")
@Entity(name = "saluation")

public class Saluation {

	private long saluation_id;
	private String saluation_name;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="saluation")
    private Employee employee;
	
	
	public Saluation() {
		
	}

	public Saluation(long saluation_id, String saluation_name) {
		super();
		this.saluation_id = saluation_id;
		this.saluation_name = saluation_name;
	}


	@Override
	public String toString() {
		return "Saluation [saluation_id=" + saluation_id + ", saluation_name=" + saluation_name + "]";
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getSaluation_id() {
		return saluation_id;
	}


	public void setSaluation_id(long saluation_id) {
		this.saluation_id = saluation_id;
	}


	public String getSaluation_name() {
		return saluation_name;
	}


	public void setSaluation_name(String saluation_name) {
		this.saluation_name = saluation_name;
	}
	
}
