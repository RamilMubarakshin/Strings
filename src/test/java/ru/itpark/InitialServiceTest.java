package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitialServiceTest {
    @Test
    public void getInitialsTwoWordsName(){
        InitialService service = new InitialService();
        String name = "Ivan Petrov";

        String actual = service.getInitials(name);

        assertEquals("IP", actual);
    }

}