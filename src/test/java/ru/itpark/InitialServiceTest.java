package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitialServiceTest {
    @Test
    public void getInitialsTwoWordsName(){
        InitialService service = new InitialService();
        String name = "Ivan Petrov";
        String expected = "IP";

        String actual = service.getInitials(name);

        assertEquals(expected, actual);
    }
    public void getInitialsOneWordName() {
        InitialService service = new InitialService();
        String name = "Ivan";
        String expected = "I";

        String actual = service.getInitials(name);

        assertEquals(expected, actual);
    }
    public void getInitialsThreeWordsName() {
        InitialService service = new InitialService();
        String name = "Huan Pedro Rodriges";
        String expected = "HP";

        String actual = service.getInitials(name);

        assertEquals(expected, actual);
    }
    public void getInitialsWordsName() {
        InitialService service = new InitialService();
        String name = "ivan petrov";
        String expected = "IP";

        String actual = service.getInitials(name);

        assertEquals(expected, actual);
    }
}