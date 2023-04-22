package org.daimt.home.study;

public class Test {

    @org.junit.jupiter.api.Test
    void hello(){
        System.out.println("hello");
    }

    @org.junit.jupiter.api.Test
    void test(){
        System.out.println(User.builder().id(2).name("Tom").build());
    }
}
