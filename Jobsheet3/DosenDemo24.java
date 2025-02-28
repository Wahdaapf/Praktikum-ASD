import java.util.Scanner;

public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = scanner.nextInt();
        scanner.nextLine();

        Dosen24[] daftarDosen = new Dosen24[jumlahDosen];

        // Input data dosen
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode         : ");
            String kode = scanner.nextLine();

            System.out.print("Nama         : ");
            String nama = scanner.nextLine();

            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jenisKelaminStr = scanner.nextLine();
            Boolean jenisKelamin = jenisKelaminStr.equalsIgnoreCase("Pria");

            System.out.print("Usia         : ");
            int usia = scanner.nextInt();
            scanner.nextLine();

            daftarDosen[i] = new Dosen24(kode, nama, jenisKelamin, usia);
        }

        DataDosen24.dataSemuaDosen(daftarDosen);
        DataDosen24.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen24.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen24.infoDosenPalingTua(daftarDosen);
        DataDosen24.infoDosenPalingMuda(daftarDosen);

        scanner.close();
    }
}
