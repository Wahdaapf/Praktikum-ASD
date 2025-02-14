import java.util.Scanner;

public class Tugas11 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        String[] KOTA = {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "SURABAYA",
            "MALANG",
            "TEGAL"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char input = scanner.next().toUpperCase().charAt(0);
        
        boolean found = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == input) {
                System.out.println("Nama kota: " + KOTA[i]);
                System.out.println("Plat Nomor: " + input);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");
        }

        scanner.close();
    }
}
