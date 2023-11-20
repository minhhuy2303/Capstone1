package com.example.capstone1.service.impl.posts;

import com.example.capstone1.model.Posts;
import com.example.capstone1.repository.posts.IAddPostsRepository;
import com.example.capstone1.service.posts.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostsService implements IPostsService {
    @Autowired
    IAddPostsRepository iAddPostsRepository;

    @Override
    public Posts addPotst(Posts posts) {
        return iAddPostsRepository.save(posts);
    }

    @Override
    public List<Posts> getAllPost(Integer id) {
        return iAddPostsRepository.getAllPost(id);
    }

    @Override
    public List<Posts> getAllPostByNameAndTopic(String name, Integer topic_id) {
        return iAddPostsRepository.getAllPostByNameAndTopic(name,topic_id);
    }

    @Override
    public Posts getPostById(Integer id) {
        return iAddPostsRepository.getPostById(id);
    }

    @Override
    public void deletePost(Integer id) {
        iAddPostsRepository.deleteById(id);
    }

    @Override
    public void updatePost(Posts posts) {
    this.iAddPostsRepository.updatePost(posts.getId(),posts.getName(),posts.getDescription(),posts.getImage(),
            posts.getTopic().getId());
    }
//    @Override
//    public void updatePost(Posts posts) {
//        this.iAddPostsRepository.updatePost(posts.getId(),posts.getName(),posts.getDescription(),posts.getImage(),
//                posts.getTitle1(),posts.getDescriptionTitle1(),posts.getImage1(),posts.getTitle2(),
//                posts.getDescriptionTitle2(),posts.getImage2(),posts.getTitle3(),posts.getDescriptionTitle3(),posts.getImage3(),posts.getTitle4()
//                ,posts.getDescriptionTitle4(),posts.getImage4(),posts.getTitle5(),posts.getDescriptionTitle5(),
//                posts.getImage5(),posts.getTitle6(),posts.getDescriptionTitle6(),posts.getImage6(),posts.getTopic().getId());
//    }
}
