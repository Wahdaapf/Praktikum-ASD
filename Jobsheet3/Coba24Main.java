import java.util.Scanner;

public class Coba24Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data yang ingin dimasukkan : ");
        int jumlah = input.nextInt();

        Coba24[] cobadataa = new Coba24[jumlah];

        for (int i = 0; i < cobadataa.length; i++) {
            System.out.print("Masukkan Nama\t: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Kelas\t: ");
            String kelas = input.nextLine();

            cobadataa[i] = new Coba24(nama, kelas);

        }

        CobaTampil24.TampilSeluruhData(cobadataa);

        input.close();


    }
}