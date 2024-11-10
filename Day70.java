public class PersegiPanjang {
    // Method dengan parameter panjang dan lebar
    public int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas PersegiPanjang
        PersegiPanjang persegi = new PersegiPanjang();

        // Memanggil method hitungLuas dengan parameter panjang dan lebar
        int panjang = 5;
        int lebar = 10;
        int luas = persegi.hitungLuas(panjang, lebar);

        // Mencetak hasil luas
        System.out.println("Luas persegi panjang dengan panjang " + panjang + " dan lebar " + lebar + " adalah: " + luas);
    }
}
