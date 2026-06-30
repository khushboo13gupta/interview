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

    public List<AuthorRequest> getHighCommentsAuthorRequest(final AuthorRequestData authorRequestData, final int submissionThreshold) {
        return authorRequestData.getData().stream()
                .filter(authorRequest -> authorRequest.getSubmissionCount() > submissionThreshold)
                .toList();
    }

    public AuthorRequestData getAuthorRequestData(final int pageNumber) {
        return authorDataClient.getAuthorRequestData(pageNumber);
    }
}
