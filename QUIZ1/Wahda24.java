public class Wahda24 {
    String merk24, model24;
    double kapasitasTangki24, konsumsiBBM24, jarakTempuh24, sisa24;

    public Wahda24(String merk24, String model24, double kapasitasTangki24, double konsumsiBBM24, double jarakTempuh24) {
        this.merk24 = merk24;
        this.model24 = model24;
        this.kapasitasTangki24 = kapasitasTangki24;
        this.konsumsiBBM24 = konsumsiBBM24;
        this.jarakTempuh24 = jarakTempuh24;
    }

    void tampilkanInformasi() {
        System.out.println("Data BBM");
        System.out.println("Merk \t\t\t:" + merk24);
        System.out.println("Model \t\t\t:" + model24);
        System.out.println("Kapasitas Tangki \t:" + kapasitasTangki24);
        System.out.println("Konsumsi BBM \t\t:" + konsumsiBBM24);
        System.out.println("Jarak Tempuh \t\t:" + jarakTempuh24);
    }

    void cekSisaBahanBakar() {
        sisa24 = kapasitasTangki24 - jarakTempuh24 / konsumsiBBM24;
        if(sisa24 < 0 ) {
            System.out.println("Bahan Bakar Habis");
        } else {
            System.out.println("Sisa Bahan Bakar \t: " + sisa24);
        }
        System.out.println();
    }
}