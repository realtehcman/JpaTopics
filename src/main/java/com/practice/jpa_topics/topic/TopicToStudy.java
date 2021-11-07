package com.practice.jpa_topics.topic;


import javax.persistence.*;

@Entity(name = "topics") //the actual table name in the DB
public class TopicToStudy {
    @Id
    @Column(
            unique = true,
            nullable = false,
            insertable = false,
            updatable = false
    )
    @SequenceGenerator(
            name = "id_generator",
            sequenceName = "id_generator",
            allocationSize = 1 //initial id value
    )
    @GeneratedValue(
            generator = "id_generator",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    @Column(
            name = "topicName",
            nullable = false
    )
    private String topicName;
    private String importance;

    public TopicToStudy() {
    }

    public TopicToStudy(String topicName, String importance) {
        this.topicName = topicName;
        this.importance = importance;
    }

    public Long getId() {
        return id;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getImportance() {
        return importance;
    }
}