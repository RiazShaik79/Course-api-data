package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
		
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("spring","Spring Framework","Spring Framework Description"),
				new Topic("java","Core Java","Core Java Description"),
				new Topic("javascript","JavaScript","JavaScript Description")
				));
	
	public List<Topic> getAllTopics() {
	//	return topics;
		List<Topic> topics = new ArrayList();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String Id) {
		//return topics.stream().filter(t -> t.getId().equals(Id)).findFirst().get();
		return topicRepository.findById(Id);
	}

	public void addTopic(Topic topic) {
	//	topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String Id) {
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
	//	topics.removeIf(t -> t.getId().equals(id));
	//	return null;
		topicRepository.deleteById(id);
		
	}
}
