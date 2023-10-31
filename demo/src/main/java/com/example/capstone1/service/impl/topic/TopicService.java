package com.example.capstone1.service.impl.topic;

import com.example.capstone1.model.Topic;
import com.example.capstone1.repository.topic.ITopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    @Autowired
    ITopicRepository iTopicRepository;

    public List<Topic> getAllTopic(){
        return iTopicRepository.findAll();
    }
}
