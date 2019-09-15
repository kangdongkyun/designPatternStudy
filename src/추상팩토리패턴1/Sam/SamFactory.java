package 추상팩토리패턴1.Sam;

import 추상팩토리패턴1.abstarct.BikeFactory;
import 추상팩토리패턴1.abstarct.Body;
import 추상팩토리패턴1.abstarct.Wheel;

public class SamFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
