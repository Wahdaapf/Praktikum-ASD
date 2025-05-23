package Percobaan;
import java.util.Scanner;

public class SLLMain24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SingleLinkedList24 sl = new SingleLinkedList24();
        sl.print();
        Mahasiswa24 mhs1 = new Mahasiswa24("12345", "Wahda", "1B", 4.0);
        sl.addFirst(mhs1);
        sl.print();
        Mahasiswa24 mhs2 = new Mahasiswa24("22345", "Galih", "1C", 3.9);
        sl.addLast(mhs2);
        sl.print();
        Mahasiswa24 mhs3 = new Mahasiswa24("32345", "Ega", "1D", 4.0);
        sl.insertAfter("Wahda", mhs3);
        sl.print();
        Mahasiswa24 mhs4 = new Mahasiswa24("42345", "Sandy", "1E", 3.8);
        sl.insertAt(2, mhs4);
        sl.print();

        System.out.println("Data index 1: ");
        sl.getData(1);

        System.out.println("Data mahasiswa wahda berada pada index: " + sl.indexOf("Wahda"));
        System.out.println();

        sl.removeFirst();
        sl.removeLast();
        sl.print();
        sl.removeAt(0);
        sl.print();

        // String jawab = "";
        // do {
        //     System.out.print("Apakah ingin Menambah data baru? (ya / tidak): ");
        //     jawab = input.nextLine();

        //     System.out.println("Masukkan nama mahasiswa : ");
        //     String nama = input.nextLine();
        //     System.out.println("Masukkan nim mahasiswa : ");
        //     String nim = input.nextLine();
        //     System.out.println("Masukkan kelas mahasiswa : ");
        //     String kelas = input.nextLine();
        //     System.out.println("Masukkan ipk mahasiswa : ");
        //     double ipk = input.nextDouble();

        //     Mahasiswa24 mhs = new Mahasiswa24(nim, nama, kelas, ipk);

        //     System.out.println();

        //     System.out.println("Silahkan pilih menu: ");
        //     System.out.println("1. Menambahkan data Diawal");
        //     System.out.println("2. Menambahkan data Setelah Nama Tertentu");
        //     System.out.println("3. Menambahkan data di index tertentu");
        //     System.out.println("4. Menambahkan data di Akhir");
        //     System.out.print("Masukkan Pilihan mu : ");
        //     int inputJawaban = input.nextInt();
        //     input.nextLine();
        //     switch (inputJawaban) {
        //         case 1:
        //             sl.addFirst(mhs);
        //             sl.print();
        //             break;
        //         case 2:
        //             System.out.print("Masukkan Nama yang ingin di cari : ");
        //             String dicari = input.nextLine();
        //             sl.insertAfter(dicari, mhs);
        //             sl.print();
        //             break;
        //         case 3: 
        //             System.out.print("Masukkan index tempat : ");
        //             int index = input.nextInt();
        //             input.nextLine();
        //             sl.insertAt(index, mhs);
        //             sl.print();
        //             break;
        //         case 4:
        //             sl.addLast(mhs);
        //             sl.print();
        //             break;
        //         default:
        //             break;
        //     }
        // } while (jawab.equalsIgnoreCase("ya"));

        input.close();
    
    }
}