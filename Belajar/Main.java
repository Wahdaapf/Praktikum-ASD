public class Main {
    public static void main(String[] args) {
        String data[][] = {
            {"WHd", "Wahda", "True", "23"},
            {"Adl", "Adella", "True", "30"},
            {"Ptr", "Putri", "False", "23"},
            {"Fbr", "Febriana", "False", "25"},
        };

        DataDosen dataDosenn = new DataDosen();
        for(int i = 0; i < data.length; i++) {
            Dosen temp = new Dosen(data[i][0], data[i][1], Boolean.parseBoolean(data[i][2]), Integer.parseInt(data[i][3]));
            dataDosenn.tambah(temp);
        }

        dataDosenn.tampil();
    }
}