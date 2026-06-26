package com.solution.example;

import com.solution.example.model.AuthorRequest;
import com.solution.example.model.AuthorRequestData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {


    public List<AuthorRequest> getHighCommentsAuthorRequest(final AuthorRequestData authorRequestData, final int submissionThreshold) {
        return authorRequestData.getData().stream()
                .filter(authorRequest -> authorRequest.getSubmissionCount() > submissionThreshold)
                .toList();
    }

    public AuthorRequestData getAuthorRequestData() {

    }
}
