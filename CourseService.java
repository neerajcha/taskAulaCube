package com.springRest.springrest.services;

import java.util.List;

import com.springRest.springrest.entities.Course;

public interface CourseService {

	List<Course> getCourses();

	//Course getCourses(long parseLong);

	public Course addCourse(Course course);

	Course getCourse(long parseLong);

	Course updateCourse(Course course);

	void deleteCourse(long parseLong);
}
