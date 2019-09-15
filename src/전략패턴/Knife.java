package 전략패턴;

public class Knife implements Weapon {
    @Override
    public void  attack(){
        System.out.println("칼공격");
    }
    @Override
    public void skill(){
        System.out.println("썰기");
    }
}
