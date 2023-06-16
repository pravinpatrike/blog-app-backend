package com.pravin.blog.services;

import com.pravin.blog.entities.Post;
import com.pravin.blog.payloads.PostDto;
import com.pravin.blog.payloads.PostResponse;

import java.util.List;

public interface PostService {

    // create
    PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

    //update
    PostDto updatePost(PostDto postDto,Integer postId);

    //delete
    void deletePost(Integer postId);

    //get all posts
    PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy,String sortDir);

    //get single Post

    PostDto getPostById(Integer postId);


    //get all posts by category
    List<PostDto> getPostsByCategory(Integer categoryId);

    //get posts by user
    List<PostDto> getPostByUser(Integer userId);

    //search Post
    List<PostDto> searchPosts(String keywords);




}
