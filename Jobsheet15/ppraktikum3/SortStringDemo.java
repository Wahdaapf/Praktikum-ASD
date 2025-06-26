package ppraktikum3;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringDemo {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");

        Collections.sort(daftarSiswa);

        System.out.println("Setelah disortir:");
        System.out.println(daftarSiswa);
    }
}
