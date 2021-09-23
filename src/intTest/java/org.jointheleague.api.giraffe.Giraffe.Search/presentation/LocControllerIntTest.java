package org.jointheleague.api.giraffe.Giraffe.Search.presentation;

import org.jointheleague.api.giraffe.Giraffe.Search.service.LocService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(LocController.class)
public class LocControllerIntTest {
    @Autowired
    private MockMvc mockMvc;

    private LocController locController;

    @Mock
    private LocService locService;
    List<Result> actualResults = = LocController.getResults(query);

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        locController = new LocController(locService);
    }

}
