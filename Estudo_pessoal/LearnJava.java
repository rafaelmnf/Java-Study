// A package is used to group related classes
package Estudo_pessoal;


// importing a libray
import java.util.Scanner; // Scanner is an object that allows getting input from the terminal
import java.util.Random; // Random generates a random number between - 2 billion and + 2 billion


// We must have a main Class and a main Method
public class LearnJava {
    // inside a CLASS, there is methods, that is functions belongs to the class
    // PUBLIC: means that the method is accessible from other parts of this program


    public static void main(String[] args) {

        // println is a combination of print and "\n", so it returns the line
        System.out.println("Learning JAVA");
        // You can type "sout" to generate a println automatically


        /* Instancia o objeto: eh o ato de criar uma copia ou uma representacao concreta de uma classe na memoria do computador, usando o operador new.
        Essa nova "instancia" da classe, que possui atributos e comportamentos definidos, torna-se um objeto individual que pode ser manipulado e cujos
         valores dos seus atributos podem ser definidos e lidos. O processo eh feito atraves de um metodo chamado construtor */
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
        System.out.printf("You are %d yo", age);

        System.out.print("Are you student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        scanner.nextLine();

        if(isStudent) {
            System.out.println("Oh, so you are a student!");
        } else {
            System.out.println("What a shame, your not a student.");
        }


        // instantiate the object
        Random random = new Random();
        int number;
        // gets a integer between [1 inclusive and 101 exclusive[
        number = random.nextInt(1,101);
        // we also can use the nextDouble(), nextBoolean();
        System.out.println(number);


        /* Using Math library
            // Pi number
            System.out.println(Math.PI);
            // Euler number
            System.out.println(Math.E);

            int result = Math.pow(2, 3); = 8
            result = Math.abs(-5); = 5 (module/absolute value)
            result = Math.sqrt(9); = 3
            result = Math.round(3.14);
            result = Math.ceil(3.14); rounds to the nearest lower number
            result = Math.floor(3.14); rounds to the nearest greater number
            result = Math.max(10, 20); gives the max value
            result = Math.min(10, 20); gives the min value

            // Ex hypotenuse = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
        */

        /* We can use also PRINTF:
            %.1f --> 1 decimal place after the comma
            %04d --> if the number is 1, gives us 0001, adds 0  padding
            %4d --> similar, but without those zeros,   1
            %-4d --> same but left justify
        */

        /* String methods
                    
        */

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

