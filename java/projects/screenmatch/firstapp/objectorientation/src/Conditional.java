public class Conditional {
    public static void main(String[] args) {
        int yearOfRelease = 2022;
        boolean includedThePlan = true;
        double movieNote = 8.1;
        String typePlan = "free";

        if (yearOfRelease >= 2022) {
            System.out.println("Filme em alta!");
        } else {
            System.out.println("Ainda vale a pena assistir.");
        }

        if (includedThePlan == true || typePlan.equals("plus")) {
            System.out.println("Filme liberado.");
        } else {
            System.out.println("Faça a adesão do plano Plus para assistir ao filme.");
        }
    }
}
