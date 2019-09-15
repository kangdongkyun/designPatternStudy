package 미디에이터패턴;

import 미디에이터패턴.contract.Colleague;

public class ChatColleague extends Colleague {
    @Override
    public void handle(String data) {
        System.out.println(this + " - " + data);
    }
}
