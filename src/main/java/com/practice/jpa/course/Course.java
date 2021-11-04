package com.practice.jpa.course;

import com.practice.jpa.topic.TopicToStudy;
import com.practice.jpa.topic.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Course {
    @Id
    private String id;

    private String topicName;
    private String description;
/*SCHEME
* A TOPIC -> MANY COURSES
* A TOPIC -> MANY COURSES
* ON JSON DIAGRAM IT DOESN'T MAKE SENSE THOUGH */

    @ManyToOne //foreign key to a primary key of the topic table
    private TopicToStudy topicToStudy;

    public Course(String id, String topicName, String description,  TopicToStudy topicToStudy, String topicId) {
        this.id = id;
        this.topicName = topicName;
        this.description = description;
        this.topicToStudy = new TopicToStudy(topicId, "", "");
    }

    public Course() {

    }

    public TopicToStudy getTopicToStudy() {
        return topicToStudy;
    }

    public void setTopicToStudy(TopicToStudy topicToStudy) {
        this.topicToStudy = topicToStudy;
    }

    public String getId() {
        return id;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getDescription() {
        return description;
    }
}