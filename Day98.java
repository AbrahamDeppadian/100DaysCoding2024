import java.util.Scanner;
public class main {
    public static void main(String[] args) {
      Scanner input=new Scanner (System.in);
      System.out.println("Masukkan nilai a: ");
        int a= input.nextInt();
      System.out.println("Masukkan nilai b: ");
        int b = input.nextInt();
        int total = 0;

        if (a % 2 != 0) {
        }

        for (int i = a; i <= b; i += 2) {
            total += i;
        }
        System.out.println("Total penjumlahan bilangan genap dari " + a + " ke " + b + " adalah: " + total);
    }
}
