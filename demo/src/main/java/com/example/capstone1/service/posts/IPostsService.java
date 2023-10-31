package com.example.capstone1.service.posts;

import com.example.capstone1.model.Posts;

import java.util.List;
import java.util.Optional;

public interface IPostsService {
    Posts addPotst(Posts posts);
    List<Posts> getAllPost(Integer id);
    Posts getPostById(Integer id);
    void deletePost(Integer id);
    void updatePost(Posts posts);
}
