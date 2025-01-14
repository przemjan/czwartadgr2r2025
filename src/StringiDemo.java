public class StringiDemo {
    public static void main(String[] args) {

        String name = "Maciek";

        int dlugosc = name.length();

        char inicjal = name.charAt(5);
        System.out.println("Mój char: " + inicjal);

        String duze, male;

        duze = name.toUpperCase();
        male = name.toLowerCase();


        System.out.println(name);
    }
}
