public class Characters {
    String name;
    int health;
    int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Characters(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
}
