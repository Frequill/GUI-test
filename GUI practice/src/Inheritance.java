public class Inheritance {
    enum Element{FIRE, WATER, EARTH, AIR}
    public static void main(String[] args) {

        Mages Throm = new Mages("Throm", 35, 10, 90, Element.FIRE);
        Thieves Alyx = new Thieves("Alyx", 40, 50,8, 15);


        System.out.println("********************");
        System.out.println("Characters at hand: ");
        System.out.println("********************");
        System.out.println();
        System.out.println(Throm.getName() + " is a " + Throm.getElement() + " mage!" + " he has " + Throm.getMana() + " mana and " + Throm.getDamage() + " damage!");
        System.out.println();
        System.out.println(Alyx.getName() + " is a thief with " + Alyx.getSneakChance() + " sneaking and " + Alyx.getFingerSmith() + " in pickpocket! He has " + Alyx.getDamage() + " damage and " + Alyx.getHealth() + " health!");

    }
}
