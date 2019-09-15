package 책임사슬패턴1;


public class Application {
    public static void main(String[] args) {
        Calculator plus = new PlusCalculator();
        Calculator sub = new SubCalculator();

        plus.setNextCalculator(sub);
        Request request1 = new Request(1,2,"+");
        Request request2 = new Request(10,2,"-");
        plus.process(request2);
        plus.process(request1);
    }
}
