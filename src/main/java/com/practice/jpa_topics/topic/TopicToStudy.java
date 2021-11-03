package com.practice.jpa_topics.topic;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TopicToStudy {
    @Id
    private int id;

    private String topicName;
    private String importance;

    public TopicToStudy() {
    }

    public TopicToStudy(int id, String topicName, String importance) {
        this.id = id;
        this.topicName = topicName;
        this.importance = importance;
    }

    public int getId() {
        return id;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getImportance() {
        return importance;
    }
}