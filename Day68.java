public class Contoh {

    
    public int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Contoh c = new Contoh();
        int hasil = c.tambah(5, 3);
        System.out.println("Hasil: " + hasil);
    }
}
