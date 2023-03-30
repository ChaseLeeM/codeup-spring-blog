package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.codeup.codeupspringblog.model.Post;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String getPosts() {
        return "View all posts";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String getPost(@PathVariable Long id) {
        return "View post with id: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPostForm() {
        return "View the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "Create a new post";
    }
}
