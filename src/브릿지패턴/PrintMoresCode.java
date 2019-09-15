package 브릿지패턴;

public class PrintMoresCode extends MorseCode {

    public PrintMoresCode(MorseCodeFunction function) {
        super(function);
    }

    //    kang
    public PrintMoresCode k(){
//        - . -
        dash();dash();dot();space();
        return this;
    }
    public PrintMoresCode a(){
//        . -
        dot();dash();space();
        return this;
    }
    public PrintMoresCode n(){
//        - .
        dash();dot();space();
        return this;
    }
    public PrintMoresCode g(){
//        - - .
        dash();dash();dot();
        return this;
    }


}
