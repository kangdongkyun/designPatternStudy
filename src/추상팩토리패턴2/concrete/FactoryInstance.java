package 추상팩토리패턴2.concrete;

import 추상팩토리패턴2.abst.Button;
import 추상팩토리패턴2.abst.GuiFac;
import 추상팩토리패턴2.abst.TextArea;

public class FactoryInstance {
    public static GuiFac getGuiFac() {
        System.out.println(System.getProperty("os.name"));

        switch (getOsCode()){
            case 0:
                return new MacGuiFactory();
            case 1:
                return new WinGuiFactory();
            case 2:
                return new LinuxGuiFactory();

        }
        return null;
    }
    private static int getOsCode(){
        if(System.getProperty("os.name").equals("Windows 10")){
            return 1;
        }
        return 0;
    }
}

class LinuxGuiFactory implements GuiFac {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("리눅스 버튼");
    }
}
class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "리눅스 텍스트에어리어";
    }
}
class MacGuiFactory implements GuiFac {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}

class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("맥 버튼");
    }
}
class MacTextArea implements TextArea {
    @Override
    public String getText() {
        return "맥 텍스트에어리어";
    }
}
class WinGuiFactory implements GuiFac {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}
class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("윈도우 버튼");
    }
}

class WinTextArea implements TextArea {
    @Override
    public String getText() {
        return "윈도우 텍스트에어리어";
    }
}
