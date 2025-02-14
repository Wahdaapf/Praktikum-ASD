import java.util.Scanner;

public class Tugas13 {
    
    static Scanner scanner = new Scanner(System.in);

    static void tampilkanJadwal(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah) {
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }

    static void tampilkanJadwalByHari(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada hari " + hari);
        }
    }

    static void tampilkanJadwalBySemester(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (semester[i] == sem) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada semester " + sem);
        }
    }

    static void cariMataKuliah(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String cariMatkul) {
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaMatkul[i].equalsIgnoreCase(cariMatkul)) {
                System.out.println("Mata Kuliah: " + namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah \"" + cariMatkul + "\" tidak ditemukan.");
        }
    }

    static void tambahMataKuliah(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = scanner.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        tambahMataKuliah(namaMatkul, sks, semester, hariKuliah, n);

        int pilihan;
        do {
            // Menampilkan menu
            System.out.println("\n=== Menu Jadwal Kuliah ===");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Seluruh Jadwal Kuliah ===");
                    tampilkanJadwal(namaMatkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("\nMasukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = scanner.nextLine();
                    System.out.println("\n=== Jadwal Kuliah pada " + hari + " ===");
                    tampilkanJadwalByHari(namaMatkul, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("\nMasukkan semester yang ingin ditampilkan: ");
                    int sem = scanner.nextInt();
                    System.out.println("\n=== Jadwal Kuliah Semester " + sem + " ===");
                    tampilkanJadwalBySemester(namaMatkul, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
                    String cariMatkul = scanner.nextLine();
                    cariMataKuliah(namaMatkul, sks, semester, hariKuliah, cariMatkul);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
