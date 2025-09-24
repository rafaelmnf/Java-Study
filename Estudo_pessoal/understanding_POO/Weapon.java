package Estudo_pessoal.understanding_POO;

// Inheritance = Herança(pt-br)
public class Weapon extends Item {
    private int damage;
    private String type;

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
    public String toString() {
        return String.format( "Weapon: %s, Quantity: %d, Type: %s, Damage: %d", getName(), getQuantity(), type, damage
        );
    }
    // The String.format() method in Java provides a way to create formatted strings using a format string and a variable number of arguments. It functions similarly to the printf function in C-like languages but returns the formatted string instead of printing it directly
}
