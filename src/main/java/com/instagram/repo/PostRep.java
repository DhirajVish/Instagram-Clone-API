package com.instagram.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagram.model.Post;

@Repository
public interface PostRep extends JpaRepository<Post, Integer> {

}
