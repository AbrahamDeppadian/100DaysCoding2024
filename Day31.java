public class Day31 {
	public static void main(String[] args) {
		//konversi String ke tipe data primitif
	String a = "123"; 
	
	//dari String ke double
	double nomor =Double.parseDouble(a);
	System.out.println("String ke double: " + nomor);
	
	//dari String ke int
	int angka = Integer.parseInt(a);
	System.out.println("String ke integer: " + angka);
	
	//dari string ke byte
	byte bit = Byte.parseByte(a);
	System.out.println("String ke byte: " + bit);
	
	//dari String ke short
	short sht = Short.parseShort(a);
	System.out.println("String ke Short: " + sht);
	
	//dari String ke long
	long lg = Long.parseLong(a);
	System.out.println("String ke long: " + lg);
	
	//dari String ke float
	float ft = Float.parseFloat(a);
	System.out.println("String ke  Float: " + ft);
	
	char c = a.charAt(0);
	System.out.println("String ke char: "+ c);
	/*yang dimunculkan di output hanya 1 karakter dan karakter itu adalah karakter pertama pada String jika pada charAt angka 0 yang dimasukkan,karna urutannya dari angka 0,
	*/
		}
}
