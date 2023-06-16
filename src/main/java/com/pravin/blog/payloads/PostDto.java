package com.pravin.blog.payloads;

import com.pravin.blog.entities.Category;
import com.pravin.blog.entities.Comment;
import com.pravin.blog.entities.User;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class PostDto {

    private String title;
    private String content;

    private String imageName;

    private Date addedDate;

    private CategoryDto category;

    private UserDto user;

    private Set<CommentDto> comments = new HashSet<>();


}
