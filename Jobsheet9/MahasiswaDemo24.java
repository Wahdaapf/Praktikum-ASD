import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackTugasMahasiswa24 stack = new StackTugasMahasiswa24(5);
        int pilih = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Melihat Jumlah Tugas Terkumpul");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa24 mhs = new Mahasiswa24(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa24 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai Tugas dari: " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = input.nextInt();
                        dinilai.tugasNilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai biner tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa24 lihat = stack.peek();
                    if(lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa24 lihatBottom = stack.peekBottom();
                    if(lihatBottom != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihatBottom.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang terkumpul: " + stack.countTasks());
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);

        input.close();
    }
}