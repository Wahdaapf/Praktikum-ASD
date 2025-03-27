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
}
