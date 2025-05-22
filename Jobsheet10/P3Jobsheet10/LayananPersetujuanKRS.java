import java.util.Scanner;

public class LayananPersetujuanKRS {
    public static void menu() {
        System.out.println("=== Menu Antrian Layanan Akademik ===");
        System.out.println("1. Check Antrian Kosong");
        System.out.println("2. Check Antrian Penuh");
        System.out.println("3. Mengosongkan Antrian");
        System.out.println("4. Menambahkan Antrian");
        System.out.println("5. Memproses Antrian");
        System.out.println("6. Menampilkan Semua Antrian");
        System.out.println("7. Menampilkan 2 Antrian Terdepan");
        System.out.println("8. Menampilkan Antrian Paling Terakhir");
        System.out.println("9. Cetak Jumlah Antrian");
        System.out.println("10. Cetak Jumlah Yang Sudah Diproses");
        System.out.println("----------------");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AntrianLayanan antrian = new AntrianLayanan(10);
        int pilihan;

        do {
            menu();
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    antrian.CheckAntrianKosong();
                    break;
                case 2:
                    antrian.CheckAntrianPenuh();
                    break;
                case 3:
                    antrian.MengosongkanAntrian();
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("-- Menambahkan Antrian --");
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 5: 
                    for(int i = 0; i < 2; i++) {
                        Mahasiswa dilayani = antrian.layaniMahasiswa();
                        if(dilayani != null) {
                            System.out.println("Melayani Mahasiswa");
                            dilayani.tampilkanData();
                        }
                    }
                    break;
                case 6: 
                    antrian.print();
                    break;
                case 7: 
                    antrian.lihatTerdepan();
                    break;
                case 8: 
                    antrian.lihatTerbelakang();
                    break;
                case 9:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 10:
                    System.out.println("Jumlah data sudah dilayani: " + antrian.getJumlahSudahDilayani());
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);

        input.close();
    }
}