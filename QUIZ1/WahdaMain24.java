public class WahdaMain24 {
    public static void main(String[] args) {
        String data24[][] = {
            {"Toyota", "Avanza", "45", "12", "400"},
            {"Honda", "Brio", "33", "14", "300"},
            {"Suzuki", "Ertiga", "50", "10", "600"},
        };

        Wahda24[] dataBBM24 = new Wahda24[data24.length];
        for (int i = 0; i < dataBBM24.length; i++) {
            dataBBM24[i] = new Wahda24(data24[i][0], data24[i][1], Integer.parseInt(data24[i][2]), Integer.parseInt(data24[i][3]), Integer.parseInt(data24[i][4]));

            dataBBM24[i].tampilkanInformasi();
            dataBBM24[i].cekSisaBahanBakar();
        }
    }
}