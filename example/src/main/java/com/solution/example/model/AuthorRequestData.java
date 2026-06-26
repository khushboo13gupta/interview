package com.solution.example.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorRequestData {

    private int page;

    @JsonAlias("per_page")
    private int perPage;
    private int total;

    @JsonAlias("total_pages")
    private int totalPages;

    private List<AuthorRequest> data;
}
