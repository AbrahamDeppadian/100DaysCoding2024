import java.util.Scanner;
public class Abraham {
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("masukkan batas maksimal: ");
        int x = input.nextInt();;
        System.out.println("berikut angka genap yang dihitung mulai dari 1 sampai"+ x + ": ");
        for (int y=2; y<=x ;y+=2){
            System.out.println(y);
        }
        

        
    }
    
}
