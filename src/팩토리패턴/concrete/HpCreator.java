package 팩토리패턴.concrete;


import 팩토리패턴.framework.Item;
import 팩토리패턴.framework.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator {
    protected void requestItemInfo(){
        System.out.println("아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청합니다.");
    }
    // 아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템 생성 로그를 기록합니다.
    protected void createItemLog(){
        System.out.println("아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템 생성 로그를 기록" + new Date());
    }
    // 아이템을 생성하는 알고리즘
    protected Item createdItem(){
        return new HpPotion();
    }
}
