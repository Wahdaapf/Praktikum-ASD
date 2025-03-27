public class SortingMain24 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting24 dataUrut1 = new Sorting24(a, a.length);

        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Setelah Data Diurutkan menggunakan bubble sort");
        dataUrut1.tampil();

        System.out.println();

        int b[] = {30, 20, 2, 8, 14};
        Sorting24 dataUrut2 = new Sorting24(b, b.length);

        System.out.println("Data awal 2");
        dataUrut2.tampil();
        dataUrut2.selectionSort();
        System.out.println("Setelah Data Diurutkan menggunakan selection sort");
        dataUrut2.tampil();

        System.out.println();

        int c[] = {40, 10, 4, 9, 3};
        Sorting24 dataUrut3 = new Sorting24(c, c.length);

        System.out.println("Data awal 3");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println("Setelah Data Diurutkan menggunakan insertion sort");
        dataUrut3.tampil();
    }
}