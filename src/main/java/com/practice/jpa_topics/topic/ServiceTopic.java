package com.practice.jpa_topics.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ServiceTopic {
    private List<TopicToStudy> listOfTopics;

    //instance block is called whenever the class is initialized by Spring Boot
    { //object block. I have to do the instance block or directly initialize the field
        listOfTopics = new ArrayList<>(Arrays.asList(
                new TopicToStudy(0, "REST_API", "very"),
                new TopicToStudy(1, "JSON", "medium"),
                new TopicToStudy(2, "servlets", "medium")
        ));
    }

    public List<TopicToStudy> getListOfTopics() {
        return listOfTopics;
    }

    public TopicToStudy get(int id) {
        for (TopicToStudy t : listOfTopics) {
            if (t.get_id() == id)
                return t;
        }
        System.out.println("No such id");
        return null;
    }

    public void add(TopicToStudy topic) {
        listOfTopics.add(topic);
    }

    public void update(String topicName, TopicToStudy newTopic) {
        for (int i = 0; i < listOfTopics.size(); i++) {
            TopicToStudy t = listOfTopics.get(i);
            if (t.getTopic().equals(topicName))
                listOfTopics.set(i, newTopic);
        }
    }

    public void delete(String topicName) {
        listOfTopics.forEach(t -> {
            if (t.getTopic().equals(topicName))
                listOfTopics.remove(t.get_id());
        });
    }
}
