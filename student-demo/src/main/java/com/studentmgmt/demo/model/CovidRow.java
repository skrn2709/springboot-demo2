package com.studentmgmt.demo.model;

import java.util.Date;

public class CovidRow {
	private int oxiReading;
	private String date;
	private String name;
	
	public CovidRow() {
		super();
	}
	
	public CovidRow(String name,String date, int oxiReading ) {
		super();
		this.oxiReading = oxiReading;
		this.date = date;
		this.name = name;
	}
	
	public void setCalcDate(String session, Date date) {
		this.setDate(date.getDate()+"/"+date.getMonth()+1+" "+session);
	}
	
	public int getOxiReading() {
		return oxiReading;
	}
	public void setOxiReading(int oxiReading) {
		this.oxiReading = oxiReading;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CovidRow [oxiReading=" + oxiReading + ", date=" + date + ", name=" + name + "]";
	}
	
	
}
