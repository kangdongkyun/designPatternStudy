package 템플릿메소드패턴;

public abstract class AbstGameConnectHelper {
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    //템플릿 메소드
    public String requestConnection(String encodedInfo){
        // 보안 작업 -> 암호화 된 문자열을 복호화
        String decodedInfo = doSecurity(encodedInfo);
        String id = "aaa";
        String pwd = "bbb";
        // 반환된 것을 가지고 아이디, 암호를 할당한다.
        if(!authentication(id, pwd)){
            throw new Error("아이디 암호 불일치");
        }
        String userName = "userName";
        int i = authorization(userName);
        switch (i){
            case -1:
                throw new Error("셧다운");
            case 0 :
                System.out.println("게임 매니저");
                break;
            case 1 :
                System.out.println("유료 회원");
                break;
            case 2 :
                System.out.println("무료 회원");
                break;
            case 3 :
                System.out.println("권한 없음");
                break;
            default:
                System.out.println("...");
                break;
        }
        return connection(decodedInfo);
    }

}
