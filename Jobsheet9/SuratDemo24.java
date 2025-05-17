import java.util.Scanner;

public class SuratDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat24 surat = new StackSurat24(5);
        int pilih = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama Mahasiswa");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Id Surat: ");
                    String idSurat = input.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin: ");
                    String jenisIzin = input.nextLine();
                    char jenisIzinChar = jenisIzin.charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = input.nextInt();
                    Surat24 srt = new Surat24(idSurat, namaMahasiswa, kelas, jenisIzinChar, durasi);
                    surat.push(srt);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", srt.namaMahasiswa);
                    break;
                case 2:
                    Surat24 dinilai = surat.pop();
                    if (dinilai != null) {
                        System.out.println("Memproses Surat dari: " + dinilai.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat24 lihat = surat.peek();
                    if(lihat != null) {
                        System.out.println("Surat terakhir dikirim oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.println("Masukkan Nama Mahasiswa yang mengirim surat: ");
                    String nama = input.nextLine();
                    Surat24 data = surat.cariSurat(nama);
                    if(data != null) {
                        System.out.println("Surat : " + data.namaMahasiswa + " " + data.kelas + " " + data.jenisIzin + " " + data.idSurat + " " + data.durasi);
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);

        input.close();
    }
}