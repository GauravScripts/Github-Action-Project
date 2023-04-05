package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestApplicationTests {

    @Test
  public void testApp(){
        TestApplication myTestApplication = new TestApplication();
        String result = myTestApplication.getStatus();
        assertEquals("OK", result);
    }

}
