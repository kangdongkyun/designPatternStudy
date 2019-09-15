package 팩토리패턴.concrete;

import 팩토리패턴.framework.Item;

public class HpPotion implements Item {
    @Override
    public void use() {
        System.out.println("체력 회복");
    }
}
