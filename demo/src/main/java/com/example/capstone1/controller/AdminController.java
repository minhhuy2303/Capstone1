package com.example.capstone1.controller;

import com.example.capstone1.model.Posts;
import com.example.capstone1.model.Role;
import com.example.capstone1.model.Topic;
import com.example.capstone1.repository.topic.ITopicRepository;
import com.example.capstone1.service.impl.topic.TopicService;
import com.example.capstone1.service.posts.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IPostsService iPostsService;

    @Autowired
    TopicService topicService;

    @GetMapping("/forAdmin")
    public Role forAdmin(){
        return new Role(1,"hello",true);
    }

    @PostMapping("/add_posts")
    public Posts addPosts(@RequestBody Posts posts){
        return  iPostsService.addPotst(posts);
    }

    @PostMapping("/updatePost")
    public void updatePost(@RequestBody Posts posts){
        System.out.println(posts.getId()+" "+posts.getName());
        this.iPostsService.updatePost(posts);
    }
    @GetMapping("/getAllTopic")
    public List<Topic> getAllTopic(){
        return topicService.getAllTopic();
    }

    @GetMapping("/getAllPost/{id}")
    public List<Posts> getAllPosts(@PathVariable Integer id){
    return iPostsService.getAllPost(id);
    }

    @GetMapping("/getPostById/{id}")
    public Posts getPostById(@PathVariable Integer id){
        return iPostsService.getPostById(id);
    }

    @GetMapping("/delete_post/{id}")
    public void deletePost(@PathVariable Integer id){
         iPostsService.deletePost(id);
    }
}
