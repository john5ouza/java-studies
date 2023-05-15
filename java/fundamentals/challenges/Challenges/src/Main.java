import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // CHALLENGER-1
        // Scanner numberObj = new Scanner(System.in);
        // System.out.println("enter the three numbers:");

        // int firstNum = numberObj.nextInt();
        // int secondNum = numberObj.nextInt();
        // int thirdNum = numberObj.nextInt();

        // System.out.println("the first numbers is: " + firstNum);
        // System.out.println("the second numbers is: " + secondNum);
        // System.out.println("the third numbers is: " + thirdNum);

        // numberObj.close();
    
    //CHALLENGER-2
    //PROGRAMA QUE TESTE VARIAÇÕES: "INPUT = N" -> 
    //SE É IMPAR OU PAR / SE ESTÁ ENTRE RANGES DE NÚMEROS ENTRE 10-10.

        // Scanner numObj = new Scanner(System.in);
        //     System.out.println("Enter the number:");
        //     int n = numObj.nextInt();

        //     if (n % 2 == 1)
        //         System.out.println("Impar");
        //     else {
        //         if (n >= 2 && n <= 5)
        //             System.out.println("A");
        //         else if (n >= 6 && n <= 20)
        //             System.out.println("B");
        //         else
        //             System.out.println("C");
        //     }

        // numObj.close();

    //CHALLENGER-3 - CALCULATOR
    Scanner s = new Scanner(System.in);
    System.out.println("Enter de number 1, operator and number 2:");

        double numOne = s.nextDouble();
        char opObj = s.next().charAt(0);
        double numTwo = s.nextDouble();

        if(opObj == '+')
                System.out.println((int)numOne + numTwo);
        else if(opObj == '-')
                System.out.println((int)numOne - numTwo);
        else if(opObj == '*')
                System.out.println((int)numOne * numTwo);
        else if(opObj == '/')
                System.out.println((int)numOne / numTwo);
        else
                System.out.println("Formato invalido.");
    
    s.close();

    }
}
