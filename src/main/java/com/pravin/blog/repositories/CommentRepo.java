package com.pravin.blog.repositories;

import com.pravin.blog.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository <Comment,Integer>{
}
