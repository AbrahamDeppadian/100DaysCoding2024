import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("masukkan angka: ");
		int a = input.nextInt();
		String n = a >=2? ("lebih besar atau sama dengan dua"):("lebih kecil dari dua");
		System.out.println(n);
	}
}
