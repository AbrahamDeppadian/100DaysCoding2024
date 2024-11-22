import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka yang akan dibulatkan: ");
        double x= input.nextDouble();
        double a=Math.round(x);
        double b=Math.floor(x);
        double c=Math.ceil(x);
        
        
        System.out.println("angka "+ x + " dibulatkan ke angka terdekat,menjadi: " + a);
        System.out.println();
        System.out.println("angka "+ x + " dibulatkan ke bawah,menjadi: " + b);
        System.out.println();
        System.out.println("angka "+ x + " dibulatkan ke atas,menjadi: " + c);
        
    }
}
