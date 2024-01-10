package com.cnts.controller;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Binding;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cnts.bean.CollegePojo;
import com.cnts.college.bean.CollegeEntity;
import com.cnts.services.imp.CollegeServiceimp;

@Controller
public class CollegeController {

	private static Logger log = LoggerFactory.getLogger(CollegeController.class.getSimpleName());

	@Autowired
	private CollegeServiceimp collegeserviceimp;
	
	@RequestMapping(path = "/standard", method = RequestMethod.GET)
	public ModelAndView CollegePojo() {
//		Map map = new HashMap();
//		map.put("headerName", "standard");
		return new ModelAndView("standard", "college", new CollegePojo());

//		Map<String, Object> map = new HashMap<>();
//		map.put("headerName", "Standard");
//		map.put("stand", new CollegePojo());
//		/return new ModelAndView("standard").addAllObjects(map);
	}

	@RequestMapping(path = "/standard", method = RequestMethod.POST)
	public ModelAndView createCollege(@ModelAttribute(name = "college") CollegePojo collegePojo,
			BindingResult binding) {
		log.info(collegePojo.toString());
		collegeserviceimp.save(collegePojo);
		return new ModelAndView("standard");

	}
	
	@RequestMapping(path = "/getall", method = RequestMethod.GET)
	public ModelAndView getAll(@ModelAttribute(name = "college") CollegePojo collegePojo,
			BindingResult binding) {
		log.info(collegePojo.toString());
		collegeserviceimp.getAll();
		return new ModelAndView("standard");

	}
	
	
	@RequestMapping(path = "/delete", method = RequestMethod.GET)
	public ModelAndView delete(Integer id) {
		collegeserviceimp.delete(id);
		return new ModelAndView("standard");

	}

}
