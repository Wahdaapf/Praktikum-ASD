import java.util.Scanner;

public class MainPangkat24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah element : ");
        int element = input.nextInt();

        Pangkat24[] png = new Pangkat24[element];
        for(int i = 0; i < png.length; i++) {
            System.out.print("Masukkan nilai basis element ke-" + (i + 1) + " : ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat element ke-" + (i + 1) + " : ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat24(basis, pangkat);
        }

        System.out.println("Hasil Pangkat BruteForce: ");
        for(Pangkat24 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("Hasil Pangkat Divide and Conquer: ");
        for(Pangkat24 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}