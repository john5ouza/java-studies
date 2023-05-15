import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner numero01Scanner = new Scanner (System.in);
        System.out.println("informe um número: ");
        int n1 = numero01Scanner.nextInt();

        Scanner numero02Scanner = new Scanner (System.in);
        System.out.println("informe um segundo número: ");
        int n2 = numero02Scanner.nextInt();

        int resultado = n1 + n2;

        System.out.println("o resultado é: " + resultado);

    }
}
