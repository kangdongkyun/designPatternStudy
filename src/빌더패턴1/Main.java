package 빌더패턴1;


public class Main {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        factory.setBlueprint(new LgGramBlueprint());
        factory.make();
        Computer computer = factory.getComputer();
//        Computer computer = new Computer("i7", "16g", "256g ssd");
        System.out.println(computer.toString());
    }
}
