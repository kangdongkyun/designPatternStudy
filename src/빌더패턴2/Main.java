package 빌더패턴2;


public class Main {
    public static void main(String[] args) {
        // 가독성 높이기
        Computer computer = ComputerBuilder
                .start()
                .setCpu("i7")
                .setRam("8g")
//                .setStorage("256g ram")
                .build();
        System.out.println(computer.toString());
    }
}
