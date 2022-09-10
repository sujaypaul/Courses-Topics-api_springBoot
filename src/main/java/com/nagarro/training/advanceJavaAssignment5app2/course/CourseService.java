package com.nagarro.training.advanceJavaAssignment5app2.course;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

//	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework description"),
//			new Topic("java", "java Framework", "java description"),
//			new Topic("javascript", "javaScript Framework", "javaScript description")));

	public List<Course> getAllCourses(String topicId) {
//		return topics;
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}

	public Optional<Course> getCourse(String id) {
		return courseRepository.findById(id);
	}

	public void addCourse(Course course) {
//		topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);

//		for (int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if (t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
	}

	public void deleteCourse(String id) {
//		topics.removeIf(t->t.getId().equals(id));
		courseRepository.deleteById(id);
	}

}
