package 책임사슬패턴2;

public class Armor implements Defense {
    private Defense nextDefense;
    private float def;

    public Armor() {
    }

    public Armor(float def) {
        this.def = def;
    }

    public void setDef(float def) {
        this.def = def;
    }

    @Override
    public void defense(Attack attack) {
        process(attack);
        if(nextDefense!=null){
            nextDefense.defense(attack);
        }
    }

    public void setNextdefense(Defense nextdefense) {
        this.nextDefense = nextdefense;
    }

    private void process(Attack attack){
        int amount = attack.getAmount();
        amount -= def;
        attack.setAmount(amount);
    }
}
