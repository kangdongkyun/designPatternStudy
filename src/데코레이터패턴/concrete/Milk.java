package 데코레이터패턴.concrete;


import 데코레이터패턴.abst.AbstAdding;
import 데코레이터패턴.abst.IBeverage;

public class Milk extends AbstAdding {

    public Milk(IBeverage meterial) {
        super(meterial);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+50;
    }

}