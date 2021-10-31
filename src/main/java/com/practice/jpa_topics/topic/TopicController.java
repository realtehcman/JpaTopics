package com.practice.jpa_topics.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/*MAPPING HAPPENS HERE.
 * Also, I inject the instance into the field*/

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public TopicService gettingTopics() {
        return topicService;
    }

    @RequestMapping("/topics/{topic}")
    public TopicToStudy gettingTopics(@PathVariable String topic) {
        return topicService.get(topic);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody TopicToStudy newTopic) {
        topicService.add(newTopic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicName}")
    public void updateTopic(@RequestBody TopicToStudy newTopic, @PathVariable String topicName) {
        topicService.update(topicName, newTopic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicName}")
    public void deleteTopic(@PathVariable String topicName) {
        topicService.delete(topicName);
    }


}

/*ERRORS 415, 500 IN POSTMAN; SOLUTION
* Add `Content-Type`: `application/json` and `Accept`: `application/json`  In the POSTMAN -> headers -> bulk edit */