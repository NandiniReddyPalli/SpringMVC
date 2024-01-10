package com.cnts.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cnts.bean.CollegePojo;
import com.cnts.college.bean.CollegeEntity;

@Repository
@Transactional
public class CollegeRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void save(CollegeEntity collegeentity) {
		hibernateTemplate.save(collegeentity);
	}

	public List<CollegeEntity> getAll() {
		return hibernateTemplate.loadAll(CollegeEntity.class);

	}
	
	public void delete(Integer id) {
		hibernateTemplate.delete(hibernateTemplate.get(CollegeEntity.class,id));;
	}

}
