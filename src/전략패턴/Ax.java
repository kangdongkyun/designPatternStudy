package 전략패턴;

public class Ax implements Weapon {
    @Override
    public void  attack(){
        System.out.println("도끼 공격");
    }
    @Override
    public void skill(){
        System.out.println("찍기");
    }
}
