package com.practice.jpa.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryCourse extends CrudRepository<Course, String> {
    List<Course> findByTopicToStudyId(String topicId);
}
