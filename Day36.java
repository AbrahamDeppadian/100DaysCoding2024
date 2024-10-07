import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
	Scanner A= new Scanner (System.in);
	System.out.println("Masukkan nilai a: ");
	int a = A.nextInt();
	System.out.println("masukkan nilai b: ");
	int b = A.nextInt();
	
	System.out.println("hasil perkalian:"+ a*b);
	System.out.println("hasil pembagian:"+ a/b);
	System.out.println("sisa bagi:"+ a%b);
	
	}
}
