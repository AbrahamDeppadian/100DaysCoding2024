import java.util.*;
public class Main {
    public static void main(String[]Args){
        Scanner input=new Scanner(System.in);
        System.out.println("masukkan batas angka: ");
    int a = input.nextInt();
        for (int i=1; i<=a; i++){
            if(i%2==0){
                System.out.print("1");
            }else if(i%2==1){
                System.out.print("0");
            }
        }
    }
}
 
