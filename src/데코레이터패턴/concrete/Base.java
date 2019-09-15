package 데코레이터패턴.concrete;

import 데코레이터패턴.abst.IBeverage;

public class Base implements IBeverage {

    @Override
    public int getTotalPrice() {
        return 0;
    }

}