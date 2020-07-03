package com.spring.firstblog.service;

import com.spring.firstblog.model.Post;

import java.util.List;

public interface FirstblogService {

    List<Post> findAll();
    Post findbyId(long id);
    Post save(Post post);
}
