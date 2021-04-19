package com.studentmgmt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmgmt.demo.model.CovidTBL;

public interface CovidRepo extends JpaRepository<CovidTBL, Integer> {

}
