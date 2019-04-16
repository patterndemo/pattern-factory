package com.pattern.factory.func;/*
 @author 天赋吉运-xxx
 @DESCRIPTION 
 @create 2019/4/15
*/

import com.pattern.factory.Milk;
import com.pattern.factory.TeLunSu;

public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new TeLunSu();
    }
}
