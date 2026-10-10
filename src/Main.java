import java.util.Scanner;

public class Main {

    // variavel global
    private final static String WELCOME_MESSAGE = "Olá! Bem vindo ao Java!";
    
    public static void main(String[] args) {
        // podemos declarar tanto com 'var' quanto com 'String', 'int' ou 'boolean', de acordo com o use case
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        System.out.println("Informe o seu nome: ");
        String name = scanner.next();
        System.out.println("Informe a sua idade: ");
        int age = scanner.nextInt();
        System.out.println("Olá, " + name + "! Você tem " + age + " anos!");

        // tipos primitivos
        byte number = 1; // byte
        int numero = 1; // int
        float number2 = 1.4f; // float
        var number3 = 1.0d; // double
        char character = 'a'; // char
        boolean booleano = true; // bool
    }
}
