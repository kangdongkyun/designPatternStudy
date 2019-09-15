package 전략패턴;

public class GameCharacter {
    private Weapon weapon;

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public void attack(){
        if(weapon == null) {
            System.out.println("맨손 공격");
        }else {
            //delegate
            weapon.attack();
        }
    }
    public void skill(){
        if(weapon == null) {
            System.out.println("주먹 공격");
        }else{
            weapon.skill();
        }
    }
}
