package com.spring.firstblog.repository;

import com.spring.firstblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirstblogRepository extends JpaRepository<Post, Long> {

}
