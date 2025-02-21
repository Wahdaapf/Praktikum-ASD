public class MataKuliahMain24 {
    public static void main(String[] args) {
        MataKuliah24 mk1 = new MataKuliah24();
        mk1.nama = "Daspro";
        mk1.sks = 2;
        mk1.kodeMK = "DP";
        mk1.jumlahJam = 10;

        MataKuliah24 mk2 = new MataKuliah24("MT", "Matdas", 3, 8);

        System.out.println("Informasi Awal Mata Kuliah:");
        mk1.tampilkanInformasi();
        mk2.tampilkanInformasi();

        System.out.println("Mengubah SKS " + mk1.nama + "...");
        mk1.ubahSKS(4);
        
        System.out.println("\nMenambah jam " + mk2.nama + "...");
        mk2.tambahJam(3);

        System.out.println("\nMengurangi jam " + mk1.nama + "...");
        mk1.kurangiJam(5);

        System.out.println("\nMengurangi jam " + mk2.nama + " dengan jumlah berlebihan...");
        mk2.kurangiJam(15);  

        System.out.println("\nInformasi Setelah Perubahan:");
        mk1.tampilkanInformasi();
        mk2.tampilkanInformasi();
    }
}