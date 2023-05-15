public class Main {
    
    //CRIANDO NOVOS MÉTODOS
    // public static void main(String[] args) {
    //     productList("Laranja", 12.20);
    //     productList("Banana", 17.50);
    // }

    // public static void productList(String productName, Double productValue) {
    //     System.out.println(productName + " - " + productValue);
    // }

    // DEBUGANDO
    public static void main(String[] args) {
        System.out.println("Lista de números pares de 0 a 20");
        evenNumbers(20);
    }

    public static void evenNumbers(int numbers) {
        for (int i = 0; i <= numbers; i++)
            if (i % 2 == 0)
                System.out.print(i + " ");
    }
}
