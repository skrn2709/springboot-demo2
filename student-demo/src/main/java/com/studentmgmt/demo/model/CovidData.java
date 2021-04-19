package com.studentmgmt.demo.model;

import java.util.List;

public class CovidData {
 private List<CovidTBL> covidData;

public CovidData() {
	super();
	
}

@Override
public String toString() {
	return "CovidData [covidData=" + covidData + "]";
}

public List<CovidTBL> getCovidData() {
	return covidData;
}

public void setCovidData(List<CovidTBL> list) {
	this.covidData = list;
}
 
}
