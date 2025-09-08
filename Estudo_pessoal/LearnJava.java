// A package is used to group related classes
package Estudo_pessoal;

// importing a libray
import java.util.Scanner;
// Scanner is an object that allows getting input from the terminal

// We must have a main Class and a main Method
public class LearnJava {
    // inside a CLASS, there is methods, that is functions belongs to the class
    // PUBLIC: means that the method is accessible from other parts of this program
    public static void main(String[] args) {

        // println is a combination of print and "\n", so it returns the line
        System.out.println("Learning JAVA");
        // You can type "sout" to generate a println automatically

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        //nextLine gets the input of everything typed before enter
        //just "next", only takes something before a "space"
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        System.out.print("Enter your age: ");
        // We can use Int, Double, Boolean...
        int age = scanner.nextInt();
        scanner.nextLine(); // if we call nextLine after calling nextInt, it can get the input buffer before pressing Enter, so is better to use scanner.NextLine, to clear it.
        System.out.println("You are " + age + " yo");

        System.out.print("Are you nerd? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        scanner.nextLine();

        if(isStudent) {
            System.out.println("Oh, so you are a NERD!");
        } else {
            System.out.println("What a shame, your not a NERD.");
        }








        scanner.close(); // At the end of the method, we have to close the scanner, so we avoid getting trash
    }


}

// To name a Class, normally we use PascalNamingConvention
// To name a Method, we use camelNamingConvention

/*  Variables:
(There is two types of variables)
    Primitive =  simple value stored directly in memory (Stack)
        -> int, double, float, char, boolean
    Reference =  memory address (stack) that points to the (heap)
        -> string, array, object
*/

