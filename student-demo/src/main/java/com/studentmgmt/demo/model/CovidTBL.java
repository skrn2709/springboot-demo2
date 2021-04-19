package com.studentmgmt.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COVID_TBL")
public class CovidTBL {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name;
	private String date1;
	private int oxireading;
	
	@Override
	public String toString() {
		return "CovidTBL [cid=" + cid + ", name=" + name + ", date1=" + date1 + ", oxireading=" + oxireading + "]";
	}
	public int getOxireading() {
		return oxireading;
	}
	public void setOxireading(int oxireading) {
		this.oxireading = oxireading;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public CovidTBL() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
