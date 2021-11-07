package com.practice.jpa_topics.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//ssa
@Service
public class ServiceTopic {

    @Autowired
    private RepositoryTopic repositoryTopic;


    public List<TopicToStudy> getListOfTopics() {
        List<TopicToStudy> toReturn = new ArrayList<>();

        repositoryTopic.findAll().forEach(toReturn::add);
        return toReturn;
    }

    public TopicToStudy get(Long id) {
        return repositoryTopic.findById(id).orElse(null);
    }

    public void add(TopicToStudy topic) {
        repositoryTopic.save(topic);
    }

    public void update(Long id, TopicToStudy newTopic) {
        add(newTopic);
    }

    public void delete(Long id) {
        repositoryTopic.deleteById(id);
    }
}
