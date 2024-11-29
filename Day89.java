import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berapa banyak elemen yang ingin ditambahkan ke dalam array? ");
        int jumlahElemen = scanner.nextInt();
        scanner.nextLine(); 
        String[] teman = new String[jumlahElemen];
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nama teman ke-" + (i + 1) + ": ");
            teman[i] = scanner.nextLine();
        }
        System.out.println("\nDaftar nama teman:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Indeks " + i + ": " + teman[i]);
        }
        System.out.print("\nMasukkan indeks elemen yang ingin diubah: ");
        int indeks = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan nilai baru untuk indeks " + indeks + ": ");
        String nilaiBaru = scanner.nextLine();
        teman[indeks] = nilaiBaru;
        System.out.println("\nDaftar nama teman setelah diperbarui:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Indeks " + i + ": " + teman[i]);
        }

        scanner.close();
    }
}
