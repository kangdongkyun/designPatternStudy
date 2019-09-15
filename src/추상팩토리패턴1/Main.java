package 추상팩토리패턴1;

import 추상팩토리패턴1.abstarct.BikeFactory;
import 추상팩토리패턴1.abstarct.Body;
import 추상팩토리패턴1.abstarct.Wheel;
import 추상팩토리패턴1.gt.GtFactory;

public class Main {

    public static void main(String[] args) {
//        BikeFactory factory = new SamFactory();
        BikeFactory factory = new GtFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();
        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
}
