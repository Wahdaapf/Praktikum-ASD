import java.util.Scanner;

public class MainSum24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah element : ");
        int elemen = input.nextInt();

        Sum24 sm = new Sum24(elemen);
        for(int i = 0; i < elemen; i++ ) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan brute force : " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan devide and conquer : " + sm.totalDC(sm.keuntungan, 0, elemen-1));

    }
}