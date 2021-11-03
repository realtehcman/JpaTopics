package com.practice.jpa_topics.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceTopic {

    @Autowired
    private RepositoryTopic repositoryTopic;


    public List<TopicToStudy> getListOfTopics() {
        List<TopicToStudy> toReturn = new ArrayList<>();

        repositoryTopic.findAll().forEach(toReturn::add);
        return toReturn;
    }

    public TopicToStudy get(String id) {
        return repositoryTopic.findById(id).orElse(null);
    }

    public void add(TopicToStudy topic) {
        repositoryTopic.save(topic);
    }

    public void update(String id, TopicToStudy newTopic) {
        add(newTopic);
    }

    public void delete(String id) {
        repositoryTopic.deleteById(id);
    }
}
