package 옵저버패턴2;

import java.util.Observable;

public class Button extends Observable {
    public void onClick(){
        setChanged();
        notifyObservers();

    }
}
