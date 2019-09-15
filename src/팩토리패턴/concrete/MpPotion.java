package 팩토리패턴.concrete;

import 팩토리패턴.framework.Item;

public class MpPotion implements Item {
    @Override
    public void use() {
        System.out.println("마력 회복");
    }
}
