import java.util.Scanner;

public class LayananAkademikSiakad {
    public static void menu() {
        System.out.println("=== Menu Antrian Layanan Akademik ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Layani Mahasiswa");
        System.out.println("3. Lihat Mahasiswa Terdepan");
        System.out.println("4. Lihat Semua Antrian");
        System.out.println("5. Jumlah Mahasiswa dalam antrian");
        System.out.println("6. Lihat Mahasiswa Terbelakang");
        System.out.println("----------------");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AntrianLayanan antrian = new AntrianLayanan(5);
        int pilihan;

        do {
            menu();
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    input.nextLine();
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
                case 2: 
                    Mahasiswa dilayani = antrian.layaniMahasiswa();
                    if(dilayani != null) {
                        System.out.println("Melayani Mahasiswa");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3: 
                    antrian.lihatTerdepan();
                    break;
                case 4: 
                    antrian.print();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6: 
                    antrian.lihatTerbelakang();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);

        input.close();
    }
}