import java.util.Scanner;
public class Abraham {
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("masukkan batas maksimal: ");
        int x = input.nextInt();;
        System.out.println("berikt angka yang dimulai dari "+ x + ": ");
        for (int y=2; y<=x ;y++){
            System.out.println(y);
        }
        

        
    }
    
}
