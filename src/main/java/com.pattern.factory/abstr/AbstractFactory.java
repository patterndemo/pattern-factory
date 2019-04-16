package com.pattern.factory.abstr;/*
 @author 天赋吉运-xxx
 @DESCRIPTION 
 @create 2019/4/15
*/

import com.pattern.factory.Milk;

import javax.swing.*;

public abstract class AbstractFactory {

    /**
     * 获得一个蒙牛品牌牛奶
     * @return
     */
    public abstract Milk getMengniu();

    /**
     * 获得一个伊利品牌牛奶
     * @return
     */
    public abstract Milk getYili();

    /**
     * 获得一个特仑苏品牌牛奶
     * @return
     */
    public abstract Milk getTelunsu();


}
