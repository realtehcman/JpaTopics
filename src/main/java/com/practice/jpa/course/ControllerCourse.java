package com.practice.jpa.course;

import com.practice.jpa.topic.TopicToStudy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*MAPPING HAPPENS HERE.
 * Also, I inject the instance into the field*/

@RestController
public class ControllerCourse {

    @Autowired
    private ServiceCourse serviceCourse;

    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> gettingCourses(@PathVariable String topicId) {
        return serviceCourse.getAllCourses(topicId);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course gettingCourse(@PathVariable String id) {
        return serviceCourse.get(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopicToStudy(new TopicToStudy(topicId, "", ""));
        serviceCourse.add(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId) {
        course.setTopicToStudy(new TopicToStudy(topicId, "", ""));
        serviceCourse.update(id, course);
    }

        @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
        public void deleteCourse(@PathVariable String id) {
        serviceCourse.delete(id);
    }
}

/*ERRORS 415, 500 IN POSTMAN; SOLUTION
 * Add `Content-Type`: `application/json` and `Accept`: `application/json`  In the POSTMAN -> headers -> bulk edit */