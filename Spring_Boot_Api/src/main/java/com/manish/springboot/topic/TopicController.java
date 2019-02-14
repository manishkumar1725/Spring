package com.manish.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	// @Autowired declare that this member variable needs dependency injection.
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
				
	}
	
	// @PathVariable tells that {id} is variable and pass this variable to id arguments.
	
	// If @RequestMapping("/topic/{foo}}") then in path variable we will write like this @PathVariable("foo") String id.
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}

	// This will create a post method to add any specific topic in the list.
	
	//@RequestBody will give instance of Topic object which is topic when we will map this url.
	
	@RequestMapping(method = RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		topicService.updateTopic(topic,id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
	
	
}
