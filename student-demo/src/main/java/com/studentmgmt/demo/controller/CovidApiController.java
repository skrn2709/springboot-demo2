package com.studentmgmt.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmgmt.demo.model.CovidRow;

@RestController
@RequestMapping(path = "/covidapi")
public class CovidApiController {

	@GetMapping(path = "/getData")
	public List<CovidRow> getData(){
		List<CovidRow> data=null;
		data=Arrays.asList(
				new CovidRow("Narayana","19/04 Night",97),
				new CovidRow("Bhagya","19/04 Night",98),
				new CovidRow("Kiran","19/04 Night",97)
				);
		return data;
	}
}
