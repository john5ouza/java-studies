import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double averageReview = 0;
        double note = 0;
        int gradeTotal = 0;

        while (note != -1) {
            System.out.println("Enter your review for this movie or -1 to done:");
            note = reading.nextDouble();

            if (note != -1) {
                averageReview += note;
                gradeTotal++;
            }
        }

        System.out.println("Average reviews: " + averageReview / gradeTotal);
    }
}
