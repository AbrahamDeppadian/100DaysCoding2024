public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "Nama='" + nama + '\'' +
                ", NIM='" + nim + '\'' +
                ", Jurusan='" + jurusan + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Abraham", "D0224001", "Teknik Informatika");
        System.out
          
