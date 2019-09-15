package 퍼사드패턴.com.kangdongkyun.facade;

import 퍼사드패턴.com.kangdongkyun.facade.system.Facade;

public class Appblication {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.process();
    }
}

