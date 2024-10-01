import java.math.BigDecimal;
public class belajar{
    
    public static void main(String[] args) {
        
        BigDecimal x =new BigDecimal("617817679.899371711771813572471");
        BigDecimal y =new BigDecimal("568399711.7794927189911992892");
        
     BigDecimal z = x.add(y);
     BigDecimal s = x.subtract(y);
        System.out.println("hasil penjumlahan desimal: "+ z);
        System.out.println("hasil pengurangan desimal: " +s);
     
    }
        }
