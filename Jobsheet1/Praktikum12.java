import java.util.Scanner;

public class Praktikum12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.println("=================");
        
        int n;
        if (nim.length() >= 2) {
            n = Integer.parseInt(nim.substring(nim.length() - 2));
        } else {
            System.out.println("NIM tidak valid.");
            scanner.close();
            return;
        }

        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* "); 
            } else {
                System.out.print(i + " "); 
            }
        }

        scanner.close();
    }
}
