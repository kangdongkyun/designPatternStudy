package 옵저버패턴3;


public class Application {
    public static void main(String[] args) {
        // 1. 제네릭
        // 2. 델리케이트
        // 3. 내부에 옵저버를 넣는다
        Button button = new Button();
        Button button2 = new Button();
        button.addObserver(new Observable.Observer<String>() {
            @Override
            public void update(Observable<String> o, String arg) {
                System.out.println(o+"is clicked!!");
            }
        });
        button2.addObserver(new Observable.Observer<String>() {
            @Override
            public void update(Observable<String> o, String arg) {
                System.out.println("메롱");
            }
        });
        button2.onClick();
        button.onClick();
        button.onClick();
    }
}