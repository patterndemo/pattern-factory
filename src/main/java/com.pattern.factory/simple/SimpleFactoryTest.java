package com.pattern.factory.simple;/*
 @author 天赋吉运-xxx
 @DESCRIPTION 
 @create 2019/4/15
*/


public class SimpleFactoryTest {
    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getMilk("特仑苏"));
    }
}
