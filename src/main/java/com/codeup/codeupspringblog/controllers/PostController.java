package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {


    public PostController(PostRepository postDao, UserController userDao) {
    }

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

    @GetMapping("/posts/{id}/edit")
    @ResponseBody
    public String editPostForm(@PathVariable Long id) {
        return "View the form for editing post with id: " + id;
    }

}
