public class DataDosen {
    Dosen dataDosen[] = new Dosen[10];
    int idx = 0;

    void tambah(Dosen dosen) {
        dataDosen[idx] = dosen;
        idx++;
    }

    void tampil() {
        for(int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void sortingASCBubbleSort() {
        for(int i = 0; i < dataDosen.length -1; i++) {
            for(int j = 1; j < dataDosen.length - i; j++) {
                if(dataDosen[j].usia < dataDosen[j-1].usia) {
                    Dosen tmp = dataDosen[j];
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
            Dosen tmp = dataDosen[index];
            dataDosen[index] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void sortingDSCInsertionSort() {
        for(int i = 1; i < dataDosen.length; i++) {
            Dosen tmp = dataDosen[i];
            int j = i;
            while(j > 0 && dataDosen[j-1].usia < tmp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = tmp;
        }
    }

    int pencarianDataSequential24(String cari) {
        int posisi = -1;
        for(int j = 0; j < dataDosen.length; j++) {
            if(dataDosen[j].nama.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int pencarianDataBinary24(double cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
    
            boolean ascending = dataDosen[left].usia < dataDosen[right].usia;
    
            if (dataDosen[mid].usia == cari) {
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

} 
