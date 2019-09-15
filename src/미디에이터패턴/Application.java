package 미디에이터패턴;

import 미디에이터패턴.contract.Colleague;
import 미디에이터패턴.contract.Mediator;

public class Application {
    public static void main(String[] args) {
        Colleague colleague1 = new ChatColleague();
        Colleague colleague2 = new ChatColleague();
        Colleague colleague3 = new ChatColleague();

        Mediator mediator = new ChatMediator();

        colleague1.join(mediator);
        colleague2.join(mediator);
        colleague3.join(mediator);

        colleague1.sendData("AAA");
        colleague2.sendData("BBB");
        colleague3.sendData("CCC");
    }
}
