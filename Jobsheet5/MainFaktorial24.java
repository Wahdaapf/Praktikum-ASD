import java.util.Scanner;

public class MainFaktorial24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();

        Faktorial24 fk = new Faktorial24();
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan BF : " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan DC : " + fk.factorialDC(nilai));
    }
}