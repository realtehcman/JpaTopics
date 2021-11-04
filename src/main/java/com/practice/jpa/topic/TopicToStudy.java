package com.practice.jpa.topic;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TopicToStudy {
    @Id
    private String id;

    private String topicName;
    private String importance;

    public TopicToStudy() {
    }

    public TopicToStudy(String id, String topicName, String importance) {
        this.id = id;
        this.topicName = topicName;
        this.importance = importance;
    }

    public String getId() {
        return id;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getImportance() {
        return importance;
    }
}