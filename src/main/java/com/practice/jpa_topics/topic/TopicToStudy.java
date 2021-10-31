package com.practice.jpa_topics.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TopicToStudy {

    @Id
    private int _id;

    private String topic;
    private String importance;

    public TopicToStudy() {
    }

    public TopicToStudy(int _id, String topic, String importance) {
        this._id = _id;
        this.topic = topic;
        this.importance = importance;
    }

    public int get_id() {
        return _id;
    }

    public String getTopic() {
        return topic;
    }

    public String getImportance() {
        return importance;
    }
}
