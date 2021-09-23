package org.jointheleague.api.giraffe.Giraffe.Search.presentation;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {
    private HomeController homeController;

    @BeforeEach
    void setUp() {
    homeController=new HomeController();
    }

    @Test
    void whenHome_thenReturnRedirect() {
        //given
        String expected = "redirect:swagger-ui.html";

        //when
        String actual = homeController.home();
        //then

        assertEquals(expected, actual);
    }

}