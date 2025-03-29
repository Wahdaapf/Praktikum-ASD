public class MhasiswBerprestasi {
    Mahasiswa24[] listMhs;
    int idx;

    MhasiswBerprestasi(int jumlah) {
        listMhs = new Mahasiswa24[jumlah];
        idx = 0;
    }

    void tambah(Mahasiswa24 m) {
        if(idx<listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for(Mahasiswa24 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-----------------------------------");
        }
    }

    void bubbleSort() {
        for(int i = 0; i < listMhs.length-1; i++) {
            for(int j = 1; j < listMhs.length-i; j++) {
                if(listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa24 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < 50-1; i++) {
            for(int j = 1; j < 50-i; j++) {
                count++;
            }
        }
        System.out.println(count + " hasilnya");
    }

    void selectionSort() {
        for(int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for(int j = i + 1; j < listMhs.length; j++) {
                if(listMhs[j].ipk > listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa24 temp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = temp;
        }
    }

    void insertionSort() {
        for(int i = 1; i < listMhs.length; i++) {
            Mahasiswa24 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for(int j = 0; j < listMhs.length; j++) {
            if(listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if(pos != -1) {
            System.out.println("Data Mahasiswa dengan IPK: " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if(pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak di temukan");
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
    
            boolean ascending = listMhs[left].ipk < listMhs[right].ipk;
    
            if (listMhs[mid].ipk == cari) {
                return mid;
            }
    
            if (ascending) { 
                if (listMhs[mid].ipk > cari) {
                    return findBinarySearch(cari, left, mid - 1);
                } else {
                    return findBinarySearch(cari, mid + 1, right);
                }
            } else { 
                if (listMhs[mid].ipk < cari) {
                    return findBinarySearch(cari, left, mid - 1);
                } else {
                    return findBinarySearch(cari, mid + 1, right);
                }
            }
        }
        return -1; 
    }    
}