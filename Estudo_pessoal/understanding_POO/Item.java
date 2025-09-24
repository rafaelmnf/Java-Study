package Estudo_pessoal.understanding_POO;

// A Class is a blueprint to use the object
public class Item {
    // Using PRIVATE means that we cannot access this variable outside this class, meaning the opposite of PUBLIC
    private final String name;
    // We use final here because we cannot change the name of an item, unless you want it to be changed
    private int quantity;

    // These two methods allow us to access and modify the private name and quantity attributes --> Encapsulation
    // It keeps the details inside the variable safe and provides control ways to access and modify it
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }

    // It is necessary to have a constructor to initialize the object
    public Item (String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override // overrides a method that exists on a superclass or comes with the interface
    public String toString() {
        return "Item: " + name + ", Quantity: " + quantity;
    }
}