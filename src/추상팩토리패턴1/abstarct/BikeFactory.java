package 추상팩토리패턴1.abstarct;

public interface BikeFactory {
    public Body createBody();
    public Wheel createWheel();
}
