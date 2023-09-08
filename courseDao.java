package com.springRest.springrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springRest.springrest.entities.Course;

public interface courseDao extends JpaRepository<Course, Long>{

}
