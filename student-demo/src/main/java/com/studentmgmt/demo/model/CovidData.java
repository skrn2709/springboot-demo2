package com.studentmgmt.demo.model;

import java.util.List;

public class CovidData {
 private List<CovidRow> covidData;

public CovidData() {
	super();
	
}

@Override
public String toString() {
	return "CovidData [covidData=" + covidData + "]";
}

public List<CovidRow> getCovidData() {
	return covidData;
}

public void setCovidData(List<CovidRow> covidData) {
	this.covidData = covidData;
}
 
}
