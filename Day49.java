import java.util.Scanner;
public class main{
        public static void main(String[]Args){
        Scanner input = new Scanner (System.in);
         System.out.println("masukkan angka: ");
         int a = input.nextInt();
         
         if (a>0){
                System.out.println("bilangan positif");
             }else if (a<0){
                 System.out.println("bilangan negatif");
             }else{
                 System.out.println("nol");
             }
         }
    
}
