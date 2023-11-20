package com.example.capstone1.controller;

import com.example.capstone1.model.Patients;
import com.example.capstone1.model.Posts;
import com.example.capstone1.model.Topic;
import com.example.capstone1.service.impl.topic.TopicService;
import com.example.capstone1.service.posts.IPostsService;
import com.example.capstone1.service.user.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IPostsService iPostsService;

    @Autowired
    private TopicService topicService;

    @Autowired
    private IUserservice iUserservice;

    @GetMapping("/getAllPost/{id}")
    public List<Posts> getAllPosts(@PathVariable Integer id){
        return iPostsService.getAllPost(id);
    }

    @GetMapping("/getAllTopic")
    public List<Topic> getAllTopic(){
        return topicService.getAllTopic();
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody Patients patients){
        iUserservice.addUser(patients);
    }

}
