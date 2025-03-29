import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa yang mau di masukkan: ");
        int jumMhs = input.nextInt();
        MhasiswBerprestasi list = new MhasiswBerprestasi(2);

        System.out.println();

        for(int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa Ke-" + (i+1));
            System.out.print("Masukkan NIM\t: ");
            String nim = input.next();
            System.out.print("Masukkan Nama\t: ");
            String nama = input.next();
            System.out.print("Masukkan Kelas\t: ");
            String kelas = input.next();
            System.out.print("Masukkan IPK\t: ");
            double ipk = input.nextDouble();
            Mahasiswa24 m = new Mahasiswa24(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        // Mahasiswa24 m1 = new Mahasiswa24("123", "Zidan", "2A", 3.2);
        // Mahasiswa24 m2 = new Mahasiswa24("124", "Ayu", "2A", 3.5);
        // Mahasiswa24 m3 = new Mahasiswa24("125", "Sofi", "2A", 3.1);
        // Mahasiswa24 m4 = new Mahasiswa24("126", "Sita", "2A", 3.9);
        // Mahasiswa24 m5 = new Mahasiswa24("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting: ");
        list.tampil();

        System.out.println();

        // System.out.println("Data Mahasiswa Setelah di Sorting");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println();

        System.out.println("Data Mahasiswa Setelah di Sorting menggunkan Selection sort");
        list.selectionSort();
        list.tampil();

        // System.out.println("Data Mahasiswa Setelah di Sorting menggunkan Insertion sort");
        // list.insertionSort();
        // list.tampil();

        System.out.println();

        // System.out.println("----------------------");
        // System.out.println("Pencarian Data");
        // System.out.println("----------------------");
        // System.out.println("Masukkan IPK mahasiswa yang mau dicari");
        // System.out.print("IPK: ");
        // double cari = input.nextDouble();

        // System.out.println("Menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(posisi, pss);
        // list.tampilDataSearch(posisi, pss);

        System.out.println();


        //melakukan pencarian data 
        System.out.println("----------------------");
        System.out.println("Pencarian Data");
        System.out.println("----------------------");
        System.out.println("Masukkan IPK mahasiswa yang mau dicari");
        System.out.print("IPK: ");
        double cari = input.nextDouble();
        System.out.println("----------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("----------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        input.close();
    }
}