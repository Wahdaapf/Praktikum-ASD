import java.util.Scanner;

public class MahsiswaDemo24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String dummy;
        
        Mahasiswa24[] arrayOfMahasiswa = new Mahasiswa24[3];

        for(int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("Masukkan Data Mahasiswa Ke-" + (i + 1));
            arrayOfMahasiswa[i] = new Mahasiswa24();
            System.out.print("NIM \t:");
            arrayOfMahasiswa[i].nim = input.nextLine();
            System.out.print("Nama \t:");
            arrayOfMahasiswa[i].nama = input.nextLine();
            System.out.print("Kelas \t:");
            arrayOfMahasiswa[i].kelas = input.nextLine();
            System.out.print("IPK \t:");
            arrayOfMahasiswa[i].ipk = input.nextFloat();
            input.nextLine();
            System.out.println("--------------------");
        }

        for(int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i].cetakInfo(arrayOfMahasiswa[i].nim, arrayOfMahasiswa[i].nama, arrayOfMahasiswa[i].kelas, arrayOfMahasiswa[i].ipk);
        }
    }
}