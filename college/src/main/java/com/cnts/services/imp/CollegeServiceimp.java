package com.cnts.services.imp;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.cnts.bean.CollegePojo;
import com.cnts.college.bean.CollegeEntity;
import com.cnts.repository.CollegeRepository;
import com.cnts.service.CollegeService;

@Service
public class CollegeServiceimp implements CollegeService {

	private static Logger log = LoggerFactory.getLogger(CollegeServiceimp.class.getSimpleName());

	@Autowired
	private CollegeRepository collegeRepository;

	@Override
	public List<CollegeEntity> getAll() {
		List<CollegeEntity> all = collegeRepository.getAll();
		for (CollegeEntity c : all) {
			System.out.println(c.getId());
			System.out.println(c.getLocation());
			System.out.println(c.getName());
		}
		return all;
	}

	@Override
	public void save(CollegePojo collegepojo) {
		CollegeEntity college = new CollegeEntity();
		college.setId(collegepojo.getId());

		college.setLocation(collegepojo.getLocation());
		college.setName(collegepojo.getName());
		collegeRepository.save(college);
		log.info("CollegeDetails" + collegepojo);
	}

	@Override
	public void delete(Integer id) {
		collegeRepository.delete(id);
		
	}

	

}
