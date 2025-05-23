package Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Antrian24 antrian = new Antrian24();
        int pilihan;

        do {
            System.out.println("\n===== MENU ANTRIAN LAYANAN KEMAHASISWAAN =====");
            System.out.println("1. Tambahkan Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Kosongkan Antrian");
            System.out.println("5. Tampilkan Mahasiswa Terdepan");
            System.out.println("6. Tampilkan Mahasiswa Terakhir");
            System.out.println("7. Tampilkan Jumlah Antrian");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Kelas Mahasiswa: ");
                    String kelas = scanner.nextLine();
                    System.out.print("Masukkan ipk Mahasiswa: ");
                    double ipk = scanner.nextDouble();
                    Mahasiswa24 mhs = new Mahasiswa24(nama, nim, kelas, ipk);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 4:
                    antrian.clear();
                    break;
                case 5:
                    antrian.tampilkanDepan();
                    break;
                 case 6:
                    antrian.tampilkanBelakang();
                    break;
                case 7:
                    antrian.jumlahAntrian();
                    break;
                case 8:
                    antrian.tampilkanSemua();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
