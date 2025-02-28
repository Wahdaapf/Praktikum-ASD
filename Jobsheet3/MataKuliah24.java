import java.util.Scanner;

public class MataKuliah24 {
    String kode;
    String nama;
    int sks;
    int jumlahJam;

    Scanner input = new Scanner(System.in);

    MataKuliah24(){};
    MataKuliah24(int sks, int jumlahJam, String kode, String nama){};

    MataKuliah24(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void TambahData(int ke) {
        System.out.println("Masukkan Data Kuliah Ke-" + (ke + 1));
        System.out.print("Kode \t:");
        this.kode = input.nextLine();
        System.out.print("Nama \t:");
        this.nama = input.nextLine();
        System.out.print("SKS \t:");
        this.sks = input.nextInt();
        input.nextLine();
        System.out.print("Jumalah Jam \t:");
        this.jumlahJam = input.nextInt();
        input.nextLine();
        System.out.println("--------------------------------");
    }

    void CetakInfo() {
        System.out.println("Kode  \t: " + this.kode);
        System.out.println("Nama  \t: " + this.nama);
        System.out.println("SKS  \t: " + this.sks);
        System.out.println("Jam  \t: " + this.jumlahJam);
        System.out.println("----------------------------");
    }
}
