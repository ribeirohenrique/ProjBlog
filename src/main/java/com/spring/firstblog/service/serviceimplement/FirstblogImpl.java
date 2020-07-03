package com.spring.firstblog.service.serviceimplement;

import com.spring.firstblog.model.Post;
import com.spring.firstblog.repository.FirstblogRepository;
import com.spring.firstblog.service.FirstblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstblogImpl implements FirstblogService {

    @Autowired
    FirstblogRepository firstblogRepository;

    @Override
    public List<Post> findAll() {
        return firstblogRepository.findAll();
    }

    @Override
    public Post findbyId(long id) {
        return firstblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return firstblogRepository.save(post);
    }
}
