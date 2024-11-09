import java.util.Scanner;

public class Kalkulator {

    // Method untuk penjumlahan
    public static double tambah(double a, double b) {
        return a + b;
    }

    // Method untuk pengurangan
    public static double kurang(double a, double b) {
        return a - b;
    }

    // Method untuk perkalian
    public static double kali(double a, double b) {
        return a * b;
    }

    // Method untuk pembagian
    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        System.out.print("Pilih operasi (+, -, *, /): ");
        char operasi = scanner.next().charAt(0);

        double hasil;
        switch (operasi) {
            case '+':
                hasil = tambah(angka1, angka2);
                break;
            case '-':
                hasil = kurang(angka1, angka2);
                break;
            case '*':
                hasil = kali(angka1, angka2);
                break;
            case '/':
                hasil = bagi(angka1, angka2);
                break;
            default:
                System.out.println("Operasi tidak valid.");
                return;
        }

        System.out.println("Hasil: " + hasil);
        scanner.close();
    }
}
