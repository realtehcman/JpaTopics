package com.practice.jpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCourse {

    @Autowired
    private RepositoryCourse repositoryTopic;


    public List<Course> getAllCourses(String topicId) {
        List<Course> toReturn = new ArrayList<>();

        repositoryTopic.findByTopicToStudyId(topicId).forEach(toReturn::add); //method ref
        //equivalent to
        //repositoryTopic.findByTopicToStudyId(topicId).forEach(t -> toReturn.add(t)); //lambda
        return toReturn;
    }

    public Course get(String id) {
        return repositoryTopic.findById(id).orElse(null);
    }

    public void add(Course topic) {
        repositoryTopic.save(topic);
    }

    public void update(String id, Course newTopic) {
        add(newTopic);
    }

    public void delete(String id) {
        repositoryTopic.deleteById(id);
    }
}
