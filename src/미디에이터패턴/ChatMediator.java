package 미디에이터패턴;

import 미디에이터패턴.contract.Colleague;
import 미디에이터패턴.contract.Mediator;

public class ChatMediator extends Mediator {
    @Override
    public void mediate(String data) {
        for (Colleague colleague :colleagues) {
            //중재 가능성
            colleague.handle(data);
        }
    }
}
