package com.techprimers.db.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class actor {

	@Id
	@GeneratedValue
	@Column(name="actor_id")
	private Integer id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name="age")
	private int age;
	
	
	

	public actor() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	

	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	@Override
	public String toString() {
		return "actor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	

	

	
	


	}





