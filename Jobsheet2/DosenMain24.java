public class DosenMain24 {
    public static void main(String[] args) {
        Dosen24 dosen = new Dosen24("D001", "Dr. Wahda", true, 2015, "Kecerdasan Buatan");
        dosen.tampilkanInformasi();
        
        System.out.println("\nMengubah status aktif dosen...");
        dosen.setStatusAktif(false);
        
        System.out.println("\nMenghitung masa kerja dosen...");
        int masaKerja = dosen.hitungMasaKerja(2025);
        System.out.println("Masa kerja: " + masaKerja + " tahun");

        System.out.println("\nMengubah bidang keahlian dosen...");
        dosen.ubahKeahlian("Pemrograman Web");
        
        System.out.println("\nInformasi terbaru dosen:");
        dosen.tampilkanInformasi();
    }
}
