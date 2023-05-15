public class Main {
    public static void main(String[] args) {
        System.out.println("This is ScreenMatch");
        System.out.println("Movie: Top Gun - Maverick");

        int yearOfRelease = 2022;
        System.out.println("Year of release: " + yearOfRelease);
        boolean includedThePlan = true;
        double movieNote = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String synopsis;
        synopsis = """
                Filme Top Gun
                Filme queer de aventura com galã dos anos 80
                ano de lançamento
                """ + yearOfRelease;
        System.out.println(synopsis);

        int score = (int) (media / 2);
        System.out.println(score);
    }
}
