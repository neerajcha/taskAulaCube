package com.springRest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.springrest.Dao.courseDao;
import com.springRest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private courseDao courseDao;
   // private List<Course> list;

    public CourseServiceImpl() {
       // list = new ArrayList<>();
        //list.add(new Course(145, "Java Core Course", "This is a course on Spring", "Completed"));
        //list.add(new Course(123, "Spring Boot Course", "Creating REST API with Spring Boot", "Completed"));
    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
	//	Course c=null;
		//for(Course course:list) {
			//if(course.getId()==courseId) {
				//c=course;
				//break;
	//		}
		//}
		return courseDao.getOne(courseId);
	}

	

	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		//list.forEach(e ->{
			//if(e.getId() == course.getId()) {
				//e.setTitle(course.getTitle());
				//e.setDescription(course.getDescription());
				//e.setStatus(course.getStatus());
			//}
		//});
		courseDao.save(course);
		return course;
	}
	
    @Override
    public void deleteCourse(long parseLong) {
    	//list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
    	Course entity = courseDao.getOne(parseLong);
    	courseDao.delete(entity);
    }
    
    
    
}
