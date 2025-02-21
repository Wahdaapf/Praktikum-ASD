public class MataKuliah24 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah24() {}

    public MataKuliah24(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi() {
        System.out.println("Nama Matkul: " + nama);
        System.out.println("Kode Matkul: " + kodeMK);
        System.out.println("SKS Matkul: " + sks);
        System.out.println("Jumlah Jam Matkul: " + jumlahJam);
        System.out.println("----------------------");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS mata kuliah " + nama + " telah diubah menjadi: " + sksBaru);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam mata kuliah " + nama + " bertambah menjadi: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam - jam >= 0) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam mata kuliah " + nama + " berkurang menjadi: " + jumlahJam);
        } else {
            System.out.println("Jam tidak dapat dikurangi, jumlah jam tidak mencukupi.");
        }
    }
}
