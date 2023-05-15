import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      PROJETO - CESTA DE FRUTAS
//      System.out.print("Informe o nome do produto: ");
//      Scanner s = new Scanner(System.in);
//      String nomeProduto = s.next().toLowerCase();
//
//      SWITH
//      switch (nomeProduto) {
//          case "banana":
//              System.out.print("O valor é: R$9,50");
//              break;
//          case "manga":
//              System.out.print("O valor é: R$12,80");
//              break;
//          case "abacate":
//              System.out.print("O valor é: R$16,10");
//      }

//        FOR LOOP
//        for (int i = 1; i<=10; i++) {
//            System.out.print(i + " ");
//        }

//        TREE WITH FOR LOOP
//        for (int linha = 0; linha < 10; linha++){
//            for (int coluna = 0; coluna < 10; coluna++){
//                if(coluna > linha){
//                    break;
//                }
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//        FOR LOOP WITH ARRAYS
//        String[] cars = {"BMW", "TESLA", "FIAT", "FERRARI", "AUDI"};
//        for (int i = 0; i < cars.length; i++)
//            System.out.print(cars[i] + " ");

//        NESTED LOOP
//        for (int i = 0; i < 2; i++)
//            for (int j = 0; j < 2; j++)
//                System.out.println(i + " " + j);

//        WHILE LOOP
//        int i = 1;
//        while (i < 5) {
//            System.out.println(" hello " + i);
//            i++;
//        }

//        DESAFIO A-01 IMPRIMIR NÚMEROS PARES
//        for (int i = 0; i <= 50; i++)
//            se o "i" divido por 2 e o "resto" for igual a "0" então os números pares
//            if (i % 2 == 0)
//                System.out.print(i + " ");

//        DESAFIO A-02 IMPRIMIR NÚMEROS IMPARES
//        for (int i = 0; i <= 50; i++)
//            if (i % 2 != 0)
//                System.out.print(i + " ");

//        DESAFIO B-01 ESPAÇO ENTRE NÚMEROS

        String txt;
        Scanner texto = new Scanner(System.in);

        System.out.print("Informe o texto: ");
        txt = texto.nextLine();

        int len1 = txt.length();
        int i;

        System.out.print("A palavra é: ");
        for (i=0; i<len1; i++) {
            System.out.print(" " + txt.charAt(i));
            System.out.print(" ");
        }
    }
}