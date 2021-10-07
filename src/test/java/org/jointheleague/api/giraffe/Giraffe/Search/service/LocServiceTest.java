package org.jointheleague.api.giraffe.Giraffe.Search.service;

import org.jointheleague.api.giraffe.Giraffe.Search.repository.LocRepo;
import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class LocServiceTest {

    private LocService locService;

    @Mock
    private LocRepo locRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        locService = new LocService(locRepository);
    }

    @Test
    void whenGetResults_thenReturnListOfResults() {
        //given
        String query = "Java";
        Result result = new Result();
        result.setTitle("TITLE");
        result.setLink("LINK");
        result.setAuthors(Collections.singletonList("AUTHORS"));
        List<Result> expectedResults = Collections.singletonList(result);

        when(locRepository.getResults(query))
                .thenReturn(expectedResults);

        //when
        List<Result> actualResults = locService.getResults(query);

        //then
        assertEquals(expectedResults, actualResults);
    }
}