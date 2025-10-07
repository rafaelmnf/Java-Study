package Estudo_pessoal.understanding_POO;

// Inheritance --> This class created gets the attributes and methods from the superclass inherited (extends)
// Item is the superclass and fruit is the subclass
public class Fruit extends Item{
    private final String type;

    public Fruit(String name, int quantity, String type) {
        super(name, quantity);
        this.type = type;
    }

    /* We could display the message Overriding a JAVA function like toString or
     we can create a abstract function in the superclass and use it overriding on this class
    @Override
    public String toString() {
        return String.format("Fruit: %s, Quantity: %d, Type: %s", getName(), getQuantity(), type);
    }
        // The String.format() method in Java provides a way to create formatted strings using a format string and a
        variable number of arguments. It functions similarly to the printf function in C-like languages but returns the
        formatted string instead of printing it directly
     */
    @Override
    public void displayInfo() {
        System.out.printf("Fruit: %s, Quantity: %d, Type: %s\n", getName(), getQuantity(), type);
    }
}
