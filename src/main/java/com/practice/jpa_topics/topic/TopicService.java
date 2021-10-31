package com.practice.jpa_topics.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    public List<TopicToStudy> getListOfTopics() {
        return (List<TopicToStudy>) topicRepository.findAll();
    }

    public TopicToStudy get(int id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void add(TopicToStudy topic) {
        topicRepository.save(topic);
    }

    public void update(String topic, TopicToStudy newTopic) {
        topicRepository.save(newTopic);
    }

    public void delete(int id) {
        topicRepository.deleteById(id);
    }
}
