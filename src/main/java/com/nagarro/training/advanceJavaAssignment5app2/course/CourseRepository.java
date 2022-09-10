package com.nagarro.training.advanceJavaAssignment5app2.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	public List<Course> findByTopicId(String topicId);

//	public List<Course> findByTopicName(String topicName);
//	public List<Course> findByDescription(String description);
	
}
