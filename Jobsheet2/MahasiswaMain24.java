public class MahasiswaMain24 {
    public static void main(String[] args) {
        Mahasiswa24 mhs1 = new Mahasiswa24();
        mhs1.nama = "Wahda Adella Putri Febriana";
        mhs1.nim = "244107020156";
        mhs1.kelas = "1 B";
        mhs1.ipk = 3.94;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1B");
        mhs1.updateIPK(4.0);
        mhs1.tampilkanInformasi();

        Mahasiswa24 mhs2 = new Mahasiswa24("Annisa Nbila", "183746553728", 3.25, "TI 2l");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();
    }
}
