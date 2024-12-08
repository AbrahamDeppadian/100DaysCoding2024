import java.util.Scanner;
public class main {
    public static void main(String[] args) {
      Scanner input=new Scanner (System.in);
      System.out.println("Masukkan nilai x: ");
        int x= input.nextInt();
      System.out.println("Masukkan nilai y: ");
        int y = input.nextInt();
        int total = 0;

        if (x % 2 != 0) {
        }

        for (int i = x; i <= y; i += 2) {
            total += i;
        }
        System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + total);
    }
}
