import java.util.Scanner;

public class Triangulo {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        
        //new é para criar o objetico, e instanciá-lo em teclado.
        Scanner teclado = new Scanner(System.in); // leitura so teclado
        double altura, base;
        double area;

        System.out.print("Informe a altura: ");
        //Int é o tipo de entrada do teclado
        altura = teclado.nextDouble();

        System.out.print("Informe a base: ");

        base = teclado.nextDouble();
        area = 0.5f * altura * base;
        System.out.println("Área: " + area);
        
        // Adicione esta linha para fechar o Scanner e resolver o aviso
        teclado.close();
    }
}