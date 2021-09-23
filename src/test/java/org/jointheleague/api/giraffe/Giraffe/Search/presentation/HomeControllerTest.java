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

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeControllerTest {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    public String home(){
        return "redirect:swagger-ui.html";

    }

}