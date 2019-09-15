package 옵저버패턴1;

public class Application {
    public static void main(String[] args) {
        Button button = new Button();

//        button.setOnClickListner(new ButtonClick());

        button.setOnClickListner(new Button.OnClickListner() {
            @Override
            public void onClick(Button button) {
                System.out.println(button + "is Clicked!!");
            }
        });
        button.onClick();
        button.onClick();
    }
}
//class ButtonClick implements Button.OnClickListner{
//
//    @Override
//    public void onClick(Button button) {
//        System.out.println(button + "is Clicked!!");
//    }
//}