package com.pattern.factory.func;/*
 @author 天赋吉运-xxx
 @DESCRIPTION 
 @create 2019/4/15
*/

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new MengNiuFactory();
        System.out.println(factory.getMilk());
    }
}
