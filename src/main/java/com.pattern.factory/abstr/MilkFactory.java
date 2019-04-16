package com.pattern.factory.abstr;/*
 @author 天赋吉运-xxx
 @DESCRIPTION 
 @create 2019/4/15
*/

import com.pattern.factory.MengNiu;
import com.pattern.factory.Milk;
import com.pattern.factory.TeLunSu;
import com.pattern.factory.YiLi;

public class MilkFactory extends AbstractFactory {
    @Override
    public Milk getMengniu() {
        return new MengNiu();
    }

    @Override
    public Milk getYili() {
        return new YiLi();
    }

    @Override
    public Milk getTelunsu() {
        return new TeLunSu();
    }
}
