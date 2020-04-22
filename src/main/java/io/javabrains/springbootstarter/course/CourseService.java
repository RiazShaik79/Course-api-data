package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
		
	private List<Course> courses = new ArrayList<>(Arrays.asList(
				new Course("spring","Spring Framework","Spring Framework Description"),
				new Course("java","Core Java","Core Java Description"),
				new Course("javascript","JavaScript","JavaScript Description")
				));
	
	public List<Course> getAllCourses() {
	//	return topics;
		List<Course> courses = new ArrayList();
		courseRepository.findAll()
		.forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourse(String Id) {
		//return topics.stream().filter(t -> t.getId().equals(Id)).findFirst().get();
		return courseRepository.findById(Id);
	}

	public void addCourse(Course course) {
	//	topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse(Course course, String Id) {
		courseRepository.save(course);
		
	}

	public void deleteCourse(String id) {
	//	topics.removeIf(t -> t.getId().equals(id));
	//	return null;
		courseRepository.deleteById(id);
		
	}
}
