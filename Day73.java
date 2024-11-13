public class Main {
    public static void main(String[] args) {
        String name = "Abraham";
        for (int i = 0; i < name.length(); i++) {
            char character = name.charAt(i);
            System.out.println("Karakter pada indeks " + i + " adalah: " + character);
        }
    }
}
