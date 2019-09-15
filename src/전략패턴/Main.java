package 전략패턴;

public class Main {

    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();
        character.attack();
        character.setWeapon(new Knife());
        character.attack();
        character.skill();
        character.setWeapon(new Sword());
        character.attack();
        character.skill();
        character.setWeapon(new Ax());
        character.attack();
        character.skill();
    }
}
