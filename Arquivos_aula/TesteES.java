import java.util.Scanner;

public class TesteES {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Lendo uma String (até a quebra de linha)
        System.out.print("Informe uma String: ");
        String texto = teclado.nextLine();
        System.out.println("Você digitou: " + texto);

        // Lendo um inteiro (Scanner já converte para int)
        System.out.print("Informe um inteiro: ");
        int numero = teclado.nextInt();
        System.out.println("Inteiro lido: " + numero);

        teclado.close();
    }
}