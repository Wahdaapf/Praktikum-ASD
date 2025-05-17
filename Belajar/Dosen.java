public class Dosen {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Dosen Kode " + kode + " Nama " + nama + " Jenis Kelamin " + (jenisKelamin ? "Laki Laki" : "Perempuan") + " Usia " + usia + " Tahun" );
    }
}