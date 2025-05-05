package math.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void testGetGreeting() {
        App app = new App();
        assertEquals("Hello World!", app.getGreeting());
    }

    @Test
    void testMainMethod() {
        // This just ensures main runs without exceptions for coverage
        App.main(new String[]{});
    }
}