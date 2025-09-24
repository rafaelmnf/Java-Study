package Estudo_pessoal.understanding_POO;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Inventory {

    // The ArrayList library is used to store and manage
    // groups of objects (since a normal array cannot store objects, just integers or string)
    private ArrayList<Item> items;
    // here we declare an ArrayList called items of item objects

    // here is the inventory constructor: it assigns a value of new empty arraylist to that array list of items
    // A CONSTRUCTOR always has the same name as the CLASS and it doesn't has a type, because it only initializes
    public Inventory () {
        items = new ArrayList<>();
    } // So now, items is an ArrayList

    // It passes a param of Item, and adds it to the items array
    public void addItem(Item item) {
        items.add(item);
    }
    // .add is a method that belongs to the java.util.ArrayList

    // PUBLIC methods is used to get access to the private variable
    public void displayInventory () {
        // For-Each: (type variableName : arrayName)
        // --> the type is type of those variables/objects inside the array, than you can create a variable that
        // represents the index of each thing inside the array
        for(Item item : items) {
            System.out.println(item.toString());
        }
    }

    
}
