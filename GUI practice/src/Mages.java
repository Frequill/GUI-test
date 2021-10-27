public class Mages extends Characters{
    int mana;
    Inheritance.Element element;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Inheritance.Element getElement() {
        return element;
    }

    public void setElement(Inheritance.Element element) {
        this.element = element;
    }

    public Mages(String name, int health, int damage, int mana, Inheritance.Element element) {
        super(name, health, damage);
        this.mana = mana;
        this.element = element;
    }
}
