import java.util.Scanner;

public class MataKuliahDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data yang Mau Di masukkan : ");
        int jumlah = input.nextInt();
        input.nextLine();
        MataKuliah24[] arrayOfMataKuliah = new MataKuliah24[jumlah];

        for(int i = 0; i < jumlah; i++) {
            arrayOfMataKuliah[i] = new MataKuliah24();
            arrayOfMataKuliah[i].TambahData(i);
        }

        for(int i = 0; i < jumlah; i++) {
            arrayOfMataKuliah[i].CetakInfo();
        }
    }
}