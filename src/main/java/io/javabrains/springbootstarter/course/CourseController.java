package io.javabrains.springbootstarter.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/courses")
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}

	@RequestMapping("/courses/{Id}")
	public  Optional<Course> getCourse(@PathVariable String Id) {
		return courseService.getCourse(Id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/course")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/courses/{Id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String Id) {
		courseService.updateCourse(course, Id );
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/courses/{Id}")
	public void deleteCourse(@PathVariable String Id) {
		courseService.deleteCourse(Id);
	}
}
