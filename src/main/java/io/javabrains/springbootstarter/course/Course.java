package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;

@Entity
public class Course {
	
	@javax.persistence.Id
	private String Id;
	private String name;
	private String desp;
	

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesp() {
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	
	public Course() {
		
	}
	
	public Course(String id, String name, String desp) {
		super();
		Id = id;
		this.name = name;
		this.desp = desp;
	}
	

}
