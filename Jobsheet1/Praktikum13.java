import java.util.Scanner;

public class Praktikum13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("=================");

        int jumlahMataKuliah = 8;

        String[] mataKuliah = new String[jumlahMataKuliah];
        int[] sksMataKuliah = new int[jumlahMataKuliah];
        double[] nilaiAngkaMataKuliah = new double[jumlahMataKuliah];
        
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            mataKuliah[i] = scanner.nextLine();
            
            System.out.print("Masukkan jumlah SKS untuk " + mataKuliah[i] + ": ");
            sksMataKuliah[i] = scanner.nextInt();
            scanner.nextLine();
        }

        double[] batasNilai = {80, 73, 65, 50, 39, 0};
        String[] nilaiHuruf = {"A", "B+", "B", "C", "D", "E"};
        double[] bobotNilai = {4.0, 3.5, 3.0, 2.5, 2.0, 1.0};

        int totalSKS = 0;
        double totalBobot = 0;

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nilai angka untuk " + mataKuliah[i] + ": ");
            nilaiAngkaMataKuliah[i] = scanner.nextDouble();

            String huruf = "E";
            double bobot = 0.0;
            
            for (int j = 0; j < batasNilai.length; j++) {
                if (nilaiAngkaMataKuliah[i] > batasNilai[j]) {
                    huruf = nilaiHuruf[j];
                    bobot = bobotNilai[j];
                    break;
                }
            }

            System.out.println("Nilai Huruf untuk " + mataKuliah[i] + ": " + huruf);

            totalSKS += sksMataKuliah[i];
            totalBobot += bobot * sksMataKuliah[i];
        }

        System.err.println(totalBobot + " " + totalSKS + "gahaga");
        double ipSemester = totalBobot / totalSKS;

        System.out.printf("\nIP Semester: %.2f\n", ipSemester);

        scanner.close();
    }
}
