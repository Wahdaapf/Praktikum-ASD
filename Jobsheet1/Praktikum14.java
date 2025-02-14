public class Praktikum14 {
    static int[][] stockBunga = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}    
    };

    // Harga per jenis bunga
    static int[] hargaBunga = {75000, 50000, 60000, 10000};

    static int[] bungaMati = {-1, -2, 0, -5};

    public static void tampilkanPendapatan() {
        System.out.println("Pendapatan jika semua bunga terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
        System.out.println();
    }

    public static void tampilkanStok() {
        System.out.println("Cabang\t\tAglonema\tKeladi\tAlocasia\tMawar");
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + "\t");
            for (int j = 0; j < stockBunga[i].length; j++) {
                System.out.print(stockBunga[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void kurangiStokBungaMati() {
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                stockBunga[i][j] += bungaMati[j]; 
                if (stockBunga[i][j] < 0) {
                    stockBunga[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        tampilkanPendapatan();

        System.out.println("Stok Bunga di Setiap Cabang:");
        tampilkanStok();

        kurangiStokBungaMati();

        System.out.println("Hasil Pengurangan Stok Bunga karena bunga mati:");
        tampilkanStok();
    }
}
