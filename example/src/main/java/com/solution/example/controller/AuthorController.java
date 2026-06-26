package com.solution.example.controller;

import com.solution.example.AuthorService;
import com.solution.example.model.AuthorRequest;
import com.solution.example.model.AuthorRequestData;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/article_users")
public class AuthorController {

    private AuthorService authorService;

    @GetMapping("/high_comments/{page}/{submissionThreshold}")
    public List<AuthorRequest> getHighCommentsAuthorRequest(@PathVariable int pageNumber, @PathVariable int submissionThreshold) {
        return authorService.getHighCommentsAuthorRequest(getAuthorRequestData(pageNumber), submissionThreshold);
    }

    @GetMapping("search/{page}")
    public AuthorRequestData getAuthorRequestData(@PathVariable int pageNumber) {
        return authorService.getAuthorRequestData();
    }
}
