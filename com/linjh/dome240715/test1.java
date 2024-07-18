package com.linjh.dome240715;

import org.junit.Test;

public class test1 {
    int s;

    public int mySqrt(int x) {
        s=x;
        if(x==0) return 0;
        return ((int)(sqrts(x)));
    }

    public double sqrts(double x){
        double res = (x + s / x) / 2;
        if (res == x) {
            return x;
        } else {
            return sqrts(res);
        }
    }

}
