package Estudo_pessoal.understanding_POO;

public class Main {
    public static void main(String[] args) {

        // Creating the object --> calling the constructor
        Inventory inventory = new Inventory();

        Item apples = new Item("Apples", 5);
        Item sword = new Item("Sword", 1);

        inventory.addItem(apples);
        inventory.addItem(sword);

        inventory.displayInventory();

    }
}

/*
1. A class is a blueprint that defines attributes (fields) and behaviors (methods).
2. To use a class, you instantiate it by calling its constructor with the new keyword. This creates an object.
3. Once instantiated, the object can use the public methods defined in its class.
4. Encapsulation is achieved by making fields private and providing public methods (getters, setters, or other behaviors) to safely access or modify them.
5. A main method (public static void main(String[] args)) usually exists in one class of the program, and inside it you create and manipulate objects
*/
