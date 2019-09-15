package 템플릿메소드패턴;

import 전략패턴.Ax;
import 전략패턴.GameCharacter;
import 전략패턴.Knife;
import 전략패턴.Sword;

public class Main {

    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("아이디 암호 등 접속 정보");
    }
}
