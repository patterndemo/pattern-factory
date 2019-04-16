package com.pattern.factory.func;/*
 @author 天赋吉运-xxx
 @DESCRIPTION 
 @create 2019/4/15
*/

import com.pattern.factory.Milk;

public interface Factory {
    // 工厂必然具有生产产品的技能，统一的产品出口
    Milk getMilk();
}
