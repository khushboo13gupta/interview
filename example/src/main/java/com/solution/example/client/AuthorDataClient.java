package com.solution.example.client;

import com.solution.example.model.AuthorRequestData;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class AuthorDataClient {

    private final RestClient restClient;

    public AuthorDataClient(RestClient.Builder builder) {
        this.restClient = builder.baseUrl("https://jsonmock.hackerrank.com")
                .build();
    }

    public AuthorRequestData getAuthorRequestData(final int pageNumber) {
        return restClient.get()
                .uri(uriBuilder -> uriBuilder.path("/api/article_users")
                        .queryParam("page", pageNumber).build())
                .retrieve()
                .body(AuthorRequestData.class);
    }

}
