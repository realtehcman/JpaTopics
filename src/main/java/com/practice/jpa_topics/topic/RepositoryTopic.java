package com.practice.jpa_topics.topic;
    /*Data access layer
    * Used to reduce the boilerplate code
    * It abstractifies the operations on the code*/


import org.springframework.data.repository.CrudRepository;

public interface RepositoryTopic extends CrudRepository<TopicToStudy, Long> {

}
