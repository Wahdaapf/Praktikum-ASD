public class MahsiswaDemo24 {
    public static void main(String[] args) {
        
        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];

        arrayOfMahasiswa[0] = new Mahasiswa();
        arrayOfMahasiswa[0].nim = "244107020";
        arrayOfMahasiswa[0].nama = "Wahda Adella";
        arrayOfMahasiswa[0].kelas = "TI-1B";
        arrayOfMahasiswa[0].ipk = (float) 3.8;

        arrayOfMahasiswa[1] = new Mahasiswa();
        arrayOfMahasiswa[1].nim = "244107030";
        arrayOfMahasiswa[1].nama = "Galih Agung";
        arrayOfMahasiswa[1].kelas = "TI-1A";
        arrayOfMahasiswa[1].ipk = (float) 3.9;

        arrayOfMahasiswa[2] = new Mahasiswa();
        arrayOfMahasiswa[2].nim = "244107010";
        arrayOfMahasiswa[2].nama = "Sandy Prida";
        arrayOfMahasiswa[2].kelas = "TI-1C";
        arrayOfMahasiswa[2].ipk = (float) 3.2;

        System.out.println("NIM  \t: " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama  \t: " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas  \t: " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK  \t: " + arrayOfMahasiswa[0].ipk);
        System.out.println("----------------------------");
        System.out.println("NIM  \t: " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama  \t: " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas  \t: " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK  \t: " + arrayOfMahasiswa[1].ipk);
        System.out.println("----------------------------");
        System.out.println("NIM  \t: " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama  \t: " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas  \t: " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK  \t: " + arrayOfMahasiswa[2].ipk);
        System.out.println("----------------------------");
    }
}