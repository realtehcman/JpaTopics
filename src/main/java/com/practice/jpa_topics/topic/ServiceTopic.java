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
        for (TopicToStudy t : listOfTopics){
            if (t.getId()==id)
                return t;
        }
        return null;
    }

    public void add(TopicToStudy topic) {
        listOfTopics.add(topic);
    }

    public void update(int id, TopicToStudy newTopic) {
        for (TopicToStudy t : listOfTopics){
            if (t.getId()==id)
                listOfTopics.set(t.getId(), newTopic);
        }
    }

    public void delete(int id){
        for (TopicToStudy t : listOfTopics){
            if (t.getId()==id)
                listOfTopics.remove(t.getId());
        }
    }
}
