package com.pattern.factory.simple;/*
 @author 天赋吉运-xxx
 @DESCRIPTION 
 @create 2019/4/15
*/

import com.pattern.factory.MengNiu;
import com.pattern.factory.Milk;
import com.pattern.factory.TeLunSu;
import com.pattern.factory.YiLi;

public class SimpleFactory {
    public Milk getMilk(String name){
        if ("蒙牛".equals(name)) {
            return new MengNiu();
        } else if ("伊利".equals(name)){
            return new YiLi();
        } else if ("特仑苏".equals(name)){
            return new TeLunSu();
        }else {
            System.out.println("不能生成所需的产品");
        return null;
        }

    }
}
