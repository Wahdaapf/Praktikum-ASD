import java.util.Scanner;

public class Praktikum11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=================");

        System.out.print("Masukkan nilai Tugas\t: ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan nilai Kuis\t: ");
        double kuis = input.nextDouble();

        System.out.print("Masukkan nilai UTS\t: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS\t: ");
        double uas = input.nextDouble();

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("=================");
            System.out.println("=================");
            System.out.println("Nilai tidak valid");
            System.out.println("=================");
            System.out.println("=================");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

            String nilaiHuruf;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            String statusLulus = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C"))
                    ? "LULUS" : "TIDAK LULUS";

            System.out.println("=================");
            System.out.println("=================");
            System.out.println("Nilai Akhir\t: " + nilaiAkhir);
            System.out.println("Nilai Huruf\t: " + nilaiHuruf);
            System.out.println("=================");
            System.out.println("=================");
            System.out.println("SELAMAT ANDA " + statusLulus);
        }

        input.close();
    }
}
