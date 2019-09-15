package 책임사슬패턴2;


public class Application {
    public static void main(String[] args) {
        Attack attack = new Attack(100);

        Armor armor1 = new Armor(10);
        Armor armor2 = new Armor(15);
        armor1.setNextdefense(armor2);

        armor1.defense(attack);

        System.out.println(attack.getAmount());

        Defense defense = new Defense() {
                @Override
                public void defense(Attack attack) {
                    int amount = attack.getAmount();
                    attack.setAmount(amount-=50);
                }
        };

        armor2.setNextdefense(defense);


        armor1.defense(attack);
        attack.setAmount(100);
        armor1.defense(attack);
        System.out.println(attack.getAmount());
    }
}
