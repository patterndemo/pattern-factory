package com.pattern.factory.abstr;/*
 @author 天赋吉运-xxx
 @DESCRIPTION 
 @create 2019/4/15
*/

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MilkFactory milkFactory = new MilkFactory();
        System.out.println(milkFactory.getMengniu().getName());
    }
}
