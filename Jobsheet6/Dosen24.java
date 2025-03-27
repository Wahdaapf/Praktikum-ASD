public class Dosen24 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen24(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + (jenisKelamin ? "Perempuan" : "Laki Laki"));
        System.out.println("Usia\t\t: " + usia);
    }
}
