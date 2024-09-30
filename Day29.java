import java.math.BigInteger;//untuk biginteger itu menggunakan import
public class day029 {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("10");
        BigInteger b = new BigInteger("20");
        //aritmatika
        BigInteger jumlah = a.add(b);
        BigInteger kurang = b.subtract(a);
        BigInteger kali = a.multiply(b);
        BigInteger bagi = b.divide(a);        
        //modulus atau sisa bagi
        BigInteger mod = b.mod(a);
              
        System.out.println("penjumlahan = " + jumlah);
        System.out.println("pengurangan = " + kurang);
        System.out.println("perkalian = " + kali);
        System.out.println("pembagian = "+ bagi);
        System.out.println("sisa bagi = " + mod);
        
        
        
    }

}
