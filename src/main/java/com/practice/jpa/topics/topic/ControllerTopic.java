package com.practice.jpa.topics.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/*MAPPING HAPPENS HERE.
 * Also, I inject the instance into the field*/

@RestController
public class ControllerTopic {

    @Autowired
    private ServiceTopic serviceTopic;

    @RequestMapping("/topics")
    public ServiceTopic gettingTopics() {
        return serviceTopic;
    }

    @RequestMapping("/topics/{id}")
    public TopicToStudy gettingTopics(@PathVariable String id) {
        return serviceTopic.get(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody TopicToStudy newTopic) {
        serviceTopic.add(newTopic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody TopicToStudy newTopic, @PathVariable String id) {
        serviceTopic.update(id, newTopic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        serviceTopic.delete(id);
    }
}

/*ERRORS 415, 500 IN POSTMAN; SOLUTION
* Add `Content-Type`: `application/json` and `Accept`: `application/json`  In the POSTMAN -> headers -> bulk edit */