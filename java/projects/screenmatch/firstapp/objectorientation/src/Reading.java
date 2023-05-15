import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter your favorite movie:");
        String movie = reading.nextLine();

        System.out.println("Enter the year of release:");
        int yearRelease = reading.nextInt();

        System.out.println("Enter your review for this movie:");
        double review = reading.nextDouble();

        System.out.println(movie);
        System.out.println(yearRelease);
        System.out.println(review);
    }
}
