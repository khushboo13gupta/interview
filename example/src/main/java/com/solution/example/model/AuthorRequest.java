package com.solution.example.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorRequest {

    private int id;

    private String username;

    private String about;

    private int submitted;

    @JsonAlias("updated_at")
    private LocalDateTime updatedAt;

    @JsonAlias("created_at")
    private long createdAt;

    @JsonAlias("submission_count")
    private int submissionCount;

    @JsonAlias("comment_count")
    private int commentCount;
}
