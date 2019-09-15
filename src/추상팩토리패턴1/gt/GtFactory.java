package 추상팩토리패턴1.gt;

import 추상팩토리패턴1.abstarct.BikeFactory;
import 추상팩토리패턴1.abstarct.Body;
import 추상팩토리패턴1.abstarct.Wheel;

public class GtFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
