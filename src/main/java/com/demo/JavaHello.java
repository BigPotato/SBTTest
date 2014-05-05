package com.demo;

/**
 * Created by wujin on 5/5/14.
 */
public class JavaHello {
    public String hello(String name) {
        return String.format("Hello %s!", name);
    }

    public static void main(String[] args) {
        JavaHello hello =  new JavaHello();
        System.out.println(hello.hello("java"));
    }
}
