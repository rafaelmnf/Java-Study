package Estudo_pessoal.understanding_POO;


public class Weapon extends Item {
    private int damage;
    private final String type;

    public Weapon (String name, int quantity, int damage, String type) {
        // super calls the constructor of the superclass
        super(name, quantity);
        // "this" just means we are using the object and passing the damage to it, it only differentiates same names
        this.damage = damage;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    @Override // overrides a method that exists on a superclass or comes with the interface
    // We can use the getName() and the getQuantity because it extends the superclass Item
    public void displayInfo() {
        System.out.printf("Weapon: %s, Quantity: %d, Type: %s, Damage: %d\n", getName(), getQuantity(), type, damage);
    }
}
