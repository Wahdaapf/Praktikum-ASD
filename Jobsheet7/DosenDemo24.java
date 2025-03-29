import java.util.Scanner;

public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DataDosen24 dataDosen = new DataDosen24();

        String data[][] = {
            {"d1", "dosen1", "true", "19"},
            {"d2", "dosen2", "false", "20"},
            {"d3", "dosen2", "true", "30"},
            {"d4", "dosen4", "false", "25"},
            {"d5", "dosen5", "false", "20"},
            {"d6", "dosen6", "true", "29"},
            {"d7", "dosen7", "true", "33"},
            {"d8", "dosen8", "true", "40"},
            {"d9", "dosen9", "false", "33"},
            {"d10", "dosen10", "true", "25"},
        };

        for (int i = 0; i < data.length; i++) {
            Dosen24 dosen = new Dosen24(
                data[i][0], data[i][1], 
                Boolean.parseBoolean(data[i][2]), 
                Integer.parseInt(data[i][3]));
            dataDosen.tambah(dosen);
        }

        dataDosen.tampil();

        System.out.println();

        System.out.println("Data setelah di sorting asc dengan bubble sort");
        dataDosen.sortingASCBubbleSort();
        dataDosen.tampil();

        // System.out.println();

        // System.out.println("Data setelah di sorting dsc dengan selection sort");
        // dataDosen.sortingDSCSelectionSort();
        // dataDosen.tampil();

        // System.out.println();

        // System.out.println("Data setelah di sorting dsc dengan insertion sort");
        // dataDosen.sortingDSCInsertionSort();
        // dataDosen.tampil();

        System.out.println();

        // sequential search
        System.out.println("----------------------");
        System.out.println("Pencarian Data");
        System.out.println("----------------------");
        System.out.println("Masukkan Nama Dosen yang mau dicari");
        System.out.print("Nama: ");
        String cari = input.next();

        System.out.println("Menggunakan sequential searching");
        double posisi = dataDosen.pencarianDataSequential24(cari);
        int pss = (int) posisi;
        dataDosen.tampilPosisi(cari, pss);
        dataDosen.tampilDataSearch(cari, pss);

        //binary search
        // System.out.println("----------------------");
        // System.out.println("Pencarian Data");
        // System.out.println("----------------------");
        // System.out.println("Masukkan Usia Dosen yang mau dicari");
        // System.out.print("Usia: ");
        // int cari = input.nextInt();

        // System.out.println("Menggunakan binary searching");
        // double posisi = dataDosen.pencarianDataBinary24(cari, 0, data.length-1);
        // int pss = (int) posisi;
        // dataDosen.tampilPosisi(Integer.toString(cari), pss);
        // dataDosen.tampilDataSearch(Integer.toString(cari), pss);

        input.close();
    }
}