public class Thieves extends Characters{
    int sneakChance;
    int fingerSmith;

    public int getSneakChance() {
        return sneakChance;
    }

    public void setSneakChance(int sneakChance) {
        this.sneakChance = sneakChance;
    }

    public int getFingerSmith() {
        return fingerSmith;
    }

    public void setFingerSmith(int fingerSmith) {
        this.fingerSmith = fingerSmith;
    }

    public Thieves(String name, int health, int damage, int sneakChance, int fingerSmith) {
        super(name, health, damage);
        this.sneakChance = sneakChance;
        this.fingerSmith = fingerSmith;
    }
}
