package 프록시패턴;

public interface Subject {
    // 자원이 적게 드는 일
    void action1();
    // 자원이 많이 드는 일, 네트워크 메모리
    void action2();
}
