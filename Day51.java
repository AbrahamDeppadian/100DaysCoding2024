import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	Scanner Abraham = new Scanner(System.in);
     
    System.out.println("mata kuliah fisika masuk pada hari ke-: ");
    
     int a = Abraham.nextInt();
  
    switch (a) {
case 1 :
    System.out.println("senin");
    break;
case 2 :
    System.out.println("selasa");
    break;
case 3 :
    System.out.println("rabu");
    break;
case 4 :
    System.out.println("kamis");
    break;
 case 5 :
    System.out.println("jumat");
    break;
case 6 :
    System.out.println("sabtu");
    break;
case 7 :
    System.out.println("minggu");
    break;

    }
        
	Abraham.close();
	}
}
