package 옵저버패턴3;


public class Button {
    public Button() {
        observable = new Observable<String>();
    }

    private  Observable<String> observable;
    public void addObserver(Observable.Observer<String> o) {
        observable.addObserver(o);
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }
    public void onClick() {
        observable.setChanged();
        notifyObservers();
    }

}
