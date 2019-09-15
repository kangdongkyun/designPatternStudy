package 팩토리패턴;

import 팩토리패턴.concrete.HpCreator;
import 팩토리패턴.concrete.MpCreator;
import 팩토리패턴.framework.Item;
import 팩토리패턴.framework.ItemCreator;

public class Main {

    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();

    }
}
