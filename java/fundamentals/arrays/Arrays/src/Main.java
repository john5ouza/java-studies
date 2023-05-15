import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] valores = {20, 10, 15, 30};
//        Arrays.sort(valores);
//        System.out.println(Arrays.toString(valores));
//        System.out.println(valores.length);

//        String [][] cars = {{"AUDI", "JEEP"}, {"BMW", "FIAT"}};
//        System.out.println(Arrays.deepToString(cars));

//        final double taxaJuros = 11.92;
//        System.out.println("a taxa de juros atual é: " + taxaJuros);
//        taxaJuros = 11.52;
//        System.out.println("a taxa de juros atual mudou para: " + taxaJuros);

//        double a = (double) 4 / (double) 3;
//        System.out.println(a);

/**
 *         OPERADORES:
 *         1. PARENTESES
 *         2. MULTIPLICAÇÃO > DIVISÃO
 *         3. SOMA > SUBTRAÇÃO
 */

//      CONVERSÃO DE TIPOS
//        String valorProduto = "10";
//        int valorTotal = Integer.parseInt(valorProduto) + 15;
//        System.out.println(valorProduto);
//        System.out.println(valorTotal);

//      A classe MATH
//        int value = (int)Math.round(Math.random() * 100);
//        System.out.println(value);

//      DESAFIO: ARRAYS EM ORDEM (NUMÉRICA E ALFABÉTICA)
            int[] years = {
                    1789, 2035, 1899, 2013,
                    1458, 2458, 1254, 1472,
                    2365, 1456, 1457, 2456
            };

            String[] stacks = {
                    "JAVA", "PYTHON", "PHP",
                    "C#", "C", "C++"
            };
            System.out.println("Array 1 - Years original: \n" + Arrays.toString(years));
            Arrays.sort(years);
            System.out.println("Array 1 - Years ordenado: \n" + Arrays.toString(years));

            System.out.println("Array 2 - Stacks original: \n" + Arrays.toString(stacks));
            Arrays.sort(stacks);
            System.out.println("Array 2 - Stacks ordenado: \n" + Arrays.toString(stacks));

    }
}