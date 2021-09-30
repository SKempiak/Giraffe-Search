package org.jointheleague.api.giraffe.Giraffe.Search.Repository;

import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.LocResponse;
import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Result;

import org.jointheleague.api.giraffe.Giraffe.Search.repository.LocRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
public class LocRepositoryTest {

    private LocRepo locRepository;

    @Mock
    WebClient webClientMock;

    @Mock
    WebClient.RequestHeadersUriSpec requestHeadersUriSpecMock;

    @Mock
    WebClient.RequestHeadersSpec requestHeadersSpecMock;

    @Mock
    WebClient.ResponseSpec responseSpecMock;

    @Mock
    Mono<LocResponse> LocResponseMonoMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        locRepository = new LocRepository(webClientMock);
    }

    @Test
    void whenGetResults_thenReturnLocResponse() {
        //given
        @Test
        void whenGetResults_thenReturnLocResponse() {
            String query = "Java";
            LocResponse locResponse = new LocResponse();
            Result result = new Result();
            result.setTitle("Java: A Drink, an Island, and a Programming Language");
            result.setAuthors(Collections.singletonList("AUTHOR"));
            result.setLink("LINK");
            List<Result> expectedResults = Collections.singletonList(result);
            locResponse.setResults(expectedResults);
            when(webClientMock.get())
                    .thenReturn(requestHeadersUriSpecMock);
            when(requestHeadersUriSpecMock.uri((Function<UriBuilder, URI>) any()))
                    .thenReturn(requestHeadersSpecMock);
            when(requestHeadersSpecMock.retrieve())
                    .thenReturn(responseSpecMock);
            when(responseSpecMock.bodyToMono(LocResponse.class))
                    .thenReturn(LocResponseMonoMock);
            when(LocResponseMonoMock.block())
                    .thenReturn(locResponse);
            //when

            List<Result> actualLocResults = locRepository.getResults(query);
            //then
            assertEquals(expectedResults, actualLocResults);
        }

        //when
        //then
    }
}
