import java.util.ArrayList;
import java.util.List;

public class DataDosen24 {
    Dosen24[] dataDosen = new Dosen24[10];
    int idx;

    void tambah(Dosen24 dosen) {
        if(dataDosen.length >= idx) {
            dataDosen[idx] = dosen;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for(Dosen24 dosen : dataDosen) {
            dosen.tampil();
            System.out.println("-----------");
        }
    }

    void sortingASCBubbleSort() {
        for(int i = 0; i < dataDosen.length -1; i++) {
            for(int j = 1; j < dataDosen.length - i; j++) {
                if(dataDosen[j].usia < dataDosen[j-1].usia) {
                    Dosen24 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
        }
    }

    void sortingDSCSelectionSort() {
        for(int i = 0; i < dataDosen.length - 1; i++) {
            int index = i;
            for(int j = i + 1; j < dataDosen.length; j++) {
                if(dataDosen[j].usia > dataDosen[index].usia) {
                    index = j;
                }
            }
            Dosen24 tmp = dataDosen[index];
            dataDosen[index] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void sortingDSCInsertionSort() {
        for(int i = 1; i < dataDosen.length; i++) {
            Dosen24 tmp = dataDosen[i];
            int j = i;
            while(j > 0 && dataDosen[j-1].usia < tmp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = tmp;
        }
    }

    //satu value saja
    // int pencarianDataSequential24(String cari) {
    //     int posisi = -1;
    //     for(int j = 0; j < dataDosen.length; j++) {
    //         if(dataDosen[j].nama.equalsIgnoreCase(cari)) {
    //             posisi = j;
    //             break;
    //         }
    //     }
    //     return posisi;
    // }

    // int pencarianDataBinary24(double cari, int left, int right) {
    //     if (right >= left) {
    //         int mid = (left + right) / 2;
    
    //         boolean ascending = dataDosen[left].usia < dataDosen[right].usia;
    
    //         if (dataDosen[mid].usia == cari) {
    //             return mid;
    //         }
    
    //         if (ascending) { 
    //             if (dataDosen[mid].usia > cari) {
    //                 return pencarianDataBinary24(cari, left, mid - 1);
    //             } else {
    //                 return pencarianDataBinary24(cari, mid + 1, right);
    //             }
    //         } else { 
    //             if (dataDosen[mid].usia < cari) {
    //                 return pencarianDataBinary24(cari, left, mid - 1);
    //             } else {
    //                 return pencarianDataBinary24(cari, mid + 1, right);
    //             }
    //         }
    //     }
    //     return -1; 
    // }    


    //value double
    int pencarianDataBinary24(double cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            boolean ascending = dataDosen[left].usia < dataDosen[right].usia;
    
            if (dataDosen[mid].usia == cari) {
                boolean duplicateFound = false;
    
                int i = mid - 1;
                while (i >= left && dataDosen[i].usia == cari) {
                    duplicateFound = true;
                    i--;
                }
    
                i = mid + 1;
                while (i <= right && dataDosen[i].usia == cari) {
                    duplicateFound = true;
                    i++;
                }
    
                if (duplicateFound) {
                    System.out.println("Data lebih dari 1 hasil ditemukan.");
                } else {
                    System.out.println("Data ditemukan di indeks: " + mid);
                }

                return mid;
            }
    
            if (ascending) { 
                if (dataDosen[mid].usia > cari) {
                    return pencarianDataBinary24(cari, left, mid - 1);
                } else {
                    return pencarianDataBinary24(cari, mid + 1, right);
                }
            } else { 
                if (dataDosen[mid].usia < cari) {
                    return pencarianDataBinary24(cari, left, mid - 1);
                } else {
                    return pencarianDataBinary24(cari, mid + 1, right);
                }
            }
        }
        return -1;
    }    

    int pencarianDataSequential24(String cari) {
        int posisii = -1;
        List<Integer> posisi = new ArrayList<>();

        for (int j = 0; j < dataDosen.length; j++) {
            if (dataDosen[j].nama.equalsIgnoreCase(cari)) {
                posisi.add(j); // Simpan semua indeks yang cocok
            }
        }

        if (posisi.isEmpty()) {
            System.out.println("Data tidak ditemukan.");
        } else if (posisi.size() > 1) {
            posisii = posisi.get(0);
            System.out.println("Data lebih dari 1 hasil ditemukan pada indeks: " + posisi);
        } else {
            posisii = posisi.get(0);
            System.out.println("Data ditemukan di indeks: " + posisi.get(0));
        }

        return posisii;
    }

    void tampilPosisi(String x, int pos) {
        if(pos != -1) {
            System.out.println("Data Dosen dengan nama: " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(String x, int pos) {
        if(pos != -1) {
            System.out.println("Nama\t\t : " + dataDosen[pos].nama);
            System.out.println("Kode\t\t : " + dataDosen[pos].kode);
            System.out.println("Jenis Kelamin\t : " + dataDosen[pos].jenisKelamin);
            System.out.println("Usia\t\t : " + dataDosen[pos].usia);
        } else {
            System.out.println("Data Dosen dengan nama " + x + " tidak di temukan");
        }
    }
}
