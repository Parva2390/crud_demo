package com.demo.crud.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;


@SpringBootTest
public class JUnitTest {

    @Autowired
    private MyService myService;

    @Test
    public void testAddNumber(){
        int result = myService.addNumbers(2,5);
        assertEquals(7,result);

    }
}
