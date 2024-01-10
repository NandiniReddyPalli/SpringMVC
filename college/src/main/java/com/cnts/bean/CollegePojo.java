package com.cnts.bean;

public class CollegePojo {

	
	private String name;

	private Integer id;
	
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "CollegePojo [name=" + name + ", id=" + id + ", location=" + location + "]";
	}

	

	
	

}
