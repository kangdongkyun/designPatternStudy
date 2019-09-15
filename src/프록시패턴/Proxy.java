package 프록시패턴;

public class Proxy implements Subject {
    private  Subject real;

    public Proxy(Subject real) {
        this.real = real;
    }

    @Override
    public void action1() {
        System.out.println("simple task by Proxy");
    }

    @Override
    public void action2() {
        this.real.action2();
    }
}
