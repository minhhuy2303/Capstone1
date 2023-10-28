package com.example.capstone1.service.impl.posts;

import com.example.capstone1.model.Posts;
import com.example.capstone1.repository.posts.IAddPostsRepository;
import com.example.capstone1.service.posts.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PostsService implements IPostsService {
    @Autowired
    IAddPostsRepository iAddPostsRepository;

    @Override
    public Posts addPotst(Posts posts) {
        return iAddPostsRepository.save(posts);
    }
}
