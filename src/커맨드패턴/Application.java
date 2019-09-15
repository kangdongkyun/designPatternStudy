//package 커맨드패턴;
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class Application {
//    public static void main(String[] args) {
//        List<Command> list = new LinkedList<>();
//
//        list.add(new Command() {
//            @Override
//            public void excute() {
//                System.out.println("task 1");
//            }
//        });
//        list.add(new Command() {
//            @Override
//            public void excute() {
//                System.out.println("task 2");
//            }
//        });
//        list.add(new Command() {
//            @Override
//            public void excute() {
//                System.out.println("task 3");
//            }
//        });
//        for (Command command : list) {
//            command.excute();
//        }
//    }
//}
