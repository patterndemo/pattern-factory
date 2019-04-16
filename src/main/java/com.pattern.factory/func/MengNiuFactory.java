package com.pattern.factory.func;/*
 @author 天赋吉运-xxx
 @DESCRIPTION 
 @create 2019/4/15
*/

import com.pattern.factory.MengNiu;
import com.pattern.factory.Milk;

public class MengNiuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new  MengNiu();
    }
}
