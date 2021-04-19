package com.studentmgmt.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmgmt.demo.model.CovidData;
import com.studentmgmt.demo.model.CovidRow;
import com.studentmgmt.demo.repository.CovidRepo;
@RestController
@RequestMapping(path = "/covidapi")
@CrossOrigin
public class CovidApiController {

	@Autowired
	CovidRepo covidRepo;
	
	
	@GetMapping(path = "/getdata")
	public ResponseEntity<CovidData> getData(){
		CovidData data=new CovidData();
	
		List<CovidRow> dataList=new ArrayList();
//		dataList=Arrays.asList(
//				new CovidRow("Narayana","19/04 Night",97),
//				new CovidRow("Bhagya","19/04 Night",98),
//				new CovidRow("Kiran","19/04 Night",97)
//				);
//	
		
		data.setCovidData(covidRepo.findAll());
		System.out.println(data.getCovidData().toArray().toString());
		ResponseEntity<CovidData> response=
				new ResponseEntity<CovidData>(
						data,
						HttpStatus.OK);
		return response;
	}
	
	@PostMapping(path = "/addrow")
	public List<CovidRow> addrow(){
		List<CovidRow> data=null;
		data=Arrays.asList(
				new CovidRow("Narayana","19/04 Night",97),
				new CovidRow("Bhagya","19/04 Night",98),
				new CovidRow("Kiran","19/04 Night",97)
				);
		return data;
	}
}
