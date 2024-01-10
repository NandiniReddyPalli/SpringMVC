package com.cnts.service;

import java.util.List;

import com.cnts.bean.CollegePojo;
import com.cnts.college.bean.CollegeEntity;

public interface CollegeService {

	public List<CollegeEntity> getAll();

	public void save(CollegePojo collegepojo);
	
	public void delete(Integer id);
}
