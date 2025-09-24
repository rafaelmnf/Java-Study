package Estudo_pessoal.understanding_POO;

// Inheritance --> This class created gets the attributes and methods from the superclass inherited
// Item is the superclass and fruit is the subclass
public class Fruit extends Item{
    private String type;

    public Fruit(String name, int quantity, String type) {
        super(name, quantity);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Fruit: %s, Quantity: %d, Type: %s", getName(), getQuantity(), type);
    }

}
