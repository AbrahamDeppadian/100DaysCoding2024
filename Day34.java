import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	System.out.println("Masukkan nama anda: ");
	String nama= input.nextLine();
	System.out.println("Masukkan umur anda: ");
	int umur=input.nextInt();
	System.out.println("Masukkan tinggi badan anda: ");
	double tb= input.nextDouble();
	
	System.out.printf("nama anda adalah:%s,umur anda adalah:%d,tinggi badan anda adalah:%.1f",nama,umur,tb);
	}}
