package 템플릿메소드패턴;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {
    protected String doSecurity(String string){
        System.out.println("강화된 알고리즘을 이용한 디코드");
        return string;
    }
    protected boolean authentication(String id, String password){
        System.out.println("아이디 암호 확인 과정");
        return true;
    }
    protected int authorization(String userName){
        System.out.println("권한 확인");
        // 서버에서 유저이름 유저의 나이를 알수 있다.
        // ~~
        return 0;
    }
    protected String connection(String info){
        System.out.println("마지막 접속 단계");
        return null;
    }

}
