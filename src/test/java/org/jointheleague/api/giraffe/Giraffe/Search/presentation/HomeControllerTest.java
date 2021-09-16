package org.jointheleague.api.giraffe.Giraffe.Search.presentation;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    HomeController h=new HomeController();
    }

    @Test
    void whenHome_thenReturnRedirect() {
        //given
        String expected = "redirect:swagger-ui.html";

        //when
        String actual = h.home();
        //then

        assertEquals(expected, actual);
    }

}