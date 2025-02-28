class DataDosen24 {
    static void dataSemuaDosen(Dosen24[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (Dosen24 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }

    static void jumlahDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n=== Jumlah Dosen Per Jenis Kelamin ===");
        System.out.println("Pria  : " + pria);
        System.out.println("Wanita: " + wanita);
    }

    static void rerataUsiaDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;
        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                countPria++;
            } else {
                totalWanita += dosen.usia;
                countWanita++;
            }
        }
        System.out.println("\n=== Rata-rata Usia Dosen Per Jenis Kelamin ===");
        System.out.println("Pria  : " + (countPria > 0 ? (double) totalPria / countPria : 0));
        System.out.println("Wanita: " + (countWanita > 0 ? (double) totalWanita / countWanita : 0));
    }

    static void infoDosenPalingTua(Dosen24[] arrayOfDosen) {
        Dosen24 tertua = arrayOfDosen[0];
        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("\n=== Dosen Paling Tua ===");
        tertua.cetakInfo();
    }

    static void infoDosenPalingMuda(Dosen24[] arrayOfDosen) {
        Dosen24 termuda = arrayOfDosen[0];
        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("\n=== Dosen Paling Muda ===");
        termuda.cetakInfo();
    }
}
