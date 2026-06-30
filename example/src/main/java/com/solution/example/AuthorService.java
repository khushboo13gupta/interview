package com.solution.example;

import com.solution.example.client.AuthorDataClient;
import com.solution.example.model.AuthorRequest;
import com.solution.example.model.AuthorRequestData;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {

    private AuthorDataClient authorDataClient;

    public List<String> getHighCommentsAuthorRequest(final AuthorRequestData authorRequestData, final int submissionThreshold) {
        return authorRequestData.getData().stream()
                .filter(authorRequest -> authorRequest.getSubmissionCount() > submissionThreshold)
                .map(AuthorRequest::getUsername)
                .toList();
    }

    public AuthorRequestData getAuthorRequestData() {
        return authorDataClient.getAuthorRequestData(1);
    }
}
