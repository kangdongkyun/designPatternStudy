package 추상팩토리패턴2;

import 추상팩토리패턴2.abst.Button;
import 추상팩토리패턴2.abst.GuiFac;
import 추상팩토리패턴2.abst.TextArea;
import 추상팩토리패턴2.concrete.FactoryInstance;

public class Main {

    public static void main(String[] args) {
        GuiFac fac = FactoryInstance.getGuiFac();
//        GuiFac fac = new WinGuiFactory();
//        GuiFac fac = new MacGuiFactory();
//        GuiFac fac = new LinuxGuiFactory();
        Button button = fac.createButton();
        TextArea area = fac.createTextArea();
        button.click();
        System.out.println(area.getText());
    }
}
