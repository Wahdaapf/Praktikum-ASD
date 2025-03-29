public class Mahasiswa24 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa24(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("Nama\t: " +nama);
        System.out.println("NIM\t: " +nim);
        System.out.println("kelas\t: " +kelas);
        System.out.println("IPK\t: " +ipk);
    }
}
