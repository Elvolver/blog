package ru.volkovd.blog.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.volkovd.blog.blog.models.Post;
import ru.volkovd.blog.blog.repo.PostRepository;

@Controller
public class MainController {

    private PostRepository postRepository;

    public MainController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/")
    public String main(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        model.addAttribute("title", "Main page");
        return "main";
    }
}
