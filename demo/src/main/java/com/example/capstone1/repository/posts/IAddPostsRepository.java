package com.example.capstone1.repository.posts;

import com.example.capstone1.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddPostsRepository extends JpaRepository<Posts,Integer> {
}
