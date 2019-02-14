package com.manish.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

// This Mark this class as Business Service.It will create a new Instance of this class..

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>( Arrays.asList(
			
			new Topic("1","MANISH"),
		    new Topic("2","RISHAV"),
		    new Topic("3","NIX")
	));
	
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		return topics.stream().filter(i -> i.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
	 
		topics.add(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		
		for(int i=0;i<topics.size();i++)
		{
			Topic t =  topics.get(i);
			
			if(t.getId().equals(id))
			{
				topics.set(i,topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
	
		topics.removeIf(i->i.getId().equals(id));
	}
}
