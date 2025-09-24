package Estudo_pessoal.understanding_POO;

public class Main {
    public static void main(String[] args) {

        // Creating the object --> calling the constructor
        Inventory inventory = new Inventory();

        // Item item =  new Item("Generic Item", 10);
        Item apples = new Item("Apples", 5);
        Item sword = new Item("Sword", 1);
        Fruit fruit = new Fruit("Apple", 20, "Fuji");
        Weapon fireball = new Weapon("fireball", 4, 25, "fire");

        inventory.addItem(fruit);
        inventory.addItem(apples);
        inventory.addItem(sword);
        inventory.addItem(fireball);

        inventory.displayInventory();


    }
}

/*
1. A class is a blueprint that defines attributes (fields) and behaviors (methods).
2. To use a class, you instantiate it by calling its constructor with the new keyword. This creates an object.
3. Once instantiated, the object can use the public methods defined in its class.
4. Encapsulation is achieved by making fields private and providing public methods (getters, setters, or other behaviors)
to safely access or modify them.
5. A main method (public static void main(String[] args)) usually exists in one class of the program, and inside it you
 create and manipulate objects
*/

// Override and Overload are elements of polymorphism
// Polymorphism is the capability of something exists or behave as different ways, depending on the context.
// Overriding allows a method to behave differently based on the object that invokes it
