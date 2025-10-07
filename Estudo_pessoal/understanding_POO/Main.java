package Estudo_pessoal.understanding_POO;

public class Main {
    public static void main(String[] args) {

        // Creating the object --> calling the constructor
        Inventory inventory = new Inventory();

        // Item item =  new Item("Generic Item", 10);
        /* It doesn't make sense creating an Item "item", because everything has some specific method or variable, so, we use the type Abstract and create separate classes with Item as father.
           Item apples = new Item("Apples", 5);
           Item sword = new Item("Sword", 1);  */
        Fruit fruit = new Fruit("Apple", 20, "Fuji");
        Weapon sword = new Weapon("sword", 1, 50, "fire");

        inventory.addItem(fruit);
        // inventory.addItem(apples);
        // inventory.addItem(sword);
        inventory.addItem(sword);

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

//Abstraction:
// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from)
/*
// An interface is "What a class must do" and a Abstract Class is "What a class is + some base logic"
An exemple of how interfaces work:

// We create a interface type with some methods
public interface Veiculo {
    void mover();
}

// Get the interface with "implements", can be used with others interfaces like: implements Veiculo, Modelo {}
public class Carro implements Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro dirige");
    }
    // Abstraction -->
}
public class Bicicleta implements Veiculo {
    @Override
    public void mover() {
        System.out.println("A bicicleta pedala");
    }
}
 */
