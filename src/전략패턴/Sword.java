package 전략패턴;

public class Sword implements Weapon {
    @Override
    public void  attack(){
        System.out.println("검 공격");
    }
    @Override
    public void skill(){
        System.out.println("자르기");
    }
}
