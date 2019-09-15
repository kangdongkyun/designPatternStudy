package 프록시패턴;

public class RealSubject implements Subject {
    @Override
    public void action1() {
        System.out.println("simple task by real");
    }

    @Override
    public void action2() {
        System.out.println("difficult task by real");
    }
}
