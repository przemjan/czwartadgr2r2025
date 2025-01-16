public class Zmienne {
    public static void main(String[] args) {
        int liczba1;
        liczba1 = 13;

        double liczba2 = 17.7;
        System.out.println("Moja liczba: " + liczba1 + ".");

        double liczba3;
        liczba3 = liczba1;
        int liczba4 = (int)liczba2;

        System.out.println("LIczba cztery: " + liczba4);

        //komentarz
        int days = 5;
        int hours = 8;
        int weeks = 52;
        int workHoursPerYear = days * hours * weeks;

        System.out.println("Wynik: " + workHoursPerYear);

        char znak = '#';

        String napis = "Dzisiaj \tjest \"ładnie\"";
        napis += ".";

        System.out.println("Mój napis: " + napis);
        System.out.print("Mój napis: " + napis + "\n");
        System.out.print("Mój napis: " + napis);

        boolean sun = false; //true

        // https://github.com/przemjan/czwartaDgr2r2025
    }
}
