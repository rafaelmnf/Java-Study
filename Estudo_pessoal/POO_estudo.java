package Estudo_pessoal;

public class POO_estudo {
    // É esse metodo (main()) que o Java procura para começar a execução.
    // As outras classes são apoio, usadas para organizar o código.
    public static void main(String[] args) {
    }
    
}

// CLASS: é um container com várias funções, funções que estão de acordo com objetivo da classe

//    //try running this code
    //    try {
    //     System.out.println("Qualquer coisa");
    //     //if something goes wrong run this code
    //    } catch() {

    //    }


/* Em Java, voce nao cria objetos direto (como em JS), você primeiro define uma classe (o molde) e depois instancia (cria/ "new")
objetos dela.
  - Classe = molde (plano de construção)
  - Objeto = produto construído a partir do molde

  // O objeto é cada instância derivada da classe; É um elemento do conjunto representado pela classe
  // Diferença de Java e JavaScript em relação a classe e objeto:
  - Classe → Receita de bolo (não dá pra comer)
  - Objeto → Bolo pronto (você usa e interage)
  - Java → Sempre precisa da receita antes de fazer o bolo
  - JavaScript → Pode inventar o bolo na hora ou seguir uma receita

  // Analogia C e Java:
  - Criar uma struct em C é parecido com criar uma classe sem métodos em Java.
  - Criar uma variável da struct em C é parecido com instanciar um objeto da classe em Java.
  - A diferença é que a classe em Java também tem funções (métodos) dentro dela, coisa que a struct em C não tem.

   // Em JAVA, ao criar um attribute ou methods ele vem vazio, não é necessário igualar a 0 ou \0.
   // Exemplo "visual" de como Java funciona:
        - CLASS: Human
        - OBJECTS: Name
        - ATTRIBUTES: height, weight or hobbies
        - METHODS: run, speak, kick, jump

    // Diferença de Public e Private:
        - public quer dizer que o atributo ou metodo pode ser acessado de qualquer lugar do programa.
        Não importa se está em outra classe ou até em outro pacote, ele fica visível.
        - private Quer dizer que o atributo ou metodo só pode ser acessado dentro da própria classe.
        Nenhuma outra classe consegue acessar diretamente. Isso serve para proteger dados (encapsulamento).
        Get e Set são como portas controladas para acessar os atributos -> GetNomeDoAtributo

    // É necessário sempre declarar uma classe separada que contém um metodo main
        - Lembrando que esse metodo deve ter o modificar de acesso do tipo static.Isto é, pode ser acessado por qualquer classe dentro (e fora) do projeto;
        - Para o metodo static não é necessário instanciar o objeto
          - Exemplo:
            -Math.sqr(900) -> vc chama o metodo diretamente, logo, não é necessário cria 'classe' nome = new 'classe';
              - A classe Math faz parte do pacote java.lang

    // PACOTES JAVA (são só uma parte da Java Standard Library (API Java), que é enorme e já vem junto com a linguagem)
        - java.lang → sempre importado automaticamente (String, Math, Object, etc).
        - java.util → coleções, listas, mapas, datas etc.
        - java.io → entrada e saída de dados.
        - java.nio → nova API de entrada e saída (mais eficiente).
        - java.net → rede e sockets.
        - java.sql → banco de dados (JDBC).
        - java.time → datas e horas (nova API do Java 8).
        - javax.swing / java.awt → interface gráfica (GUI).
          - java.awt.event

        // we can import other java files
        // we can run a API, that is a long list of methods
                ->  JAR é um arquivo/ficheiro compactado, usado para distribuir um conjunto de classes Java
*/