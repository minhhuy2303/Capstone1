package com.example.capstone1.repository.topic;

import com.example.capstone1.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicRepository  extends JpaRepository<Topic,Integer> {
}
