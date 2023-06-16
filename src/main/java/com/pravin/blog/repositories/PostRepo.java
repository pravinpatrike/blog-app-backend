package com.pravin.blog.repositories;

import com.pravin.blog.entities.Category;
import com.pravin.blog.entities.Post;
import com.pravin.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Integer> {

    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);

    List<Post> findByTitleContaining(String title);

}
