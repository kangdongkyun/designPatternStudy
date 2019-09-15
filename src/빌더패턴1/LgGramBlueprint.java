package 빌더패턴1;

public class LgGramBlueprint extends Blueprint {

    private Computer computer;

    public LgGramBlueprint() {
        computer = new Computer("default","default","default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i5");
    }

    @Override
    public void setRam() {
        computer.setRam("8g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256g ssd");
    }

    @Override
    Computer getComputer() {
        return computer;
    }
}
