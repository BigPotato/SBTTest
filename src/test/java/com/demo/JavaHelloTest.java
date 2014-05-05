package com.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloTest {

    @Test
    public void testHello() throws Exception {
        JavaHello hello = new JavaHello();
        assertEquals("Hello scala!", hello.hello("scala"));
    }
}