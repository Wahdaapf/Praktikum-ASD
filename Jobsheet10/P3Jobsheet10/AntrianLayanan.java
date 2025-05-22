public class AntrianLayanan {
    Mahasiswa[] data;
    int front, rear, size, max, sudahDilayani = 0;

    public AntrianLayanan(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    boolean IsEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean IsFull() {
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    void lihatTerdepan() {
        if(!IsEmpty()) {
            System.out.println("Mahasiswa Terdepan:");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[front].tampilkanData();
            if(size > 1) {
                int second = (front + 1) % max;
                data[second].tampilkanData();
            } else {
                System.out.println("Hanya satu antrian tersedia");
            }
        } else {
            System.out.println("Antrian Kosong");
        }
    }    

    void lihatTerbelakang() {
        if(!IsEmpty()) {
            System.out.print("Mahasiswa Terbelakang : ");
            System.out.println("NIM - Nama - Prodi - Kelas index ke " + rear);
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian Kosong");
        }
    }

    void print() {
        if(IsEmpty()) {
            System.out.println("Antrian Kosong");
            return;
        } else {
            System.out.println("Daftar Mahasiswa dalam antrian");
            System.out.println("NIM - Nama - Prodi - Kelas");
            for(int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i+1) + ". ");
                data[index].tampilkanData();
            }
        }
    }      

    void CheckAntrianKosong() {
        if(IsEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            System.out.println("Masih Tersisa " + (max - size) + " posisi kosong");
        }
    }

    void CheckAntrianPenuh() {
        if(IsFull()) {
            System.out.println("Antrian Penuh");
        } else {
            System.out.println("Masih Tersisa " + (max - size) + " posisi kosong");
        }
    }

    void MengosongkanAntrian() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    void tambahAntrian(Mahasiswa mhs) {
        if(IsFull() || size >= 10) {
            System.out.println("Antrian sudah penuh tidak dapat menambahkan mahasiswa");
            return;
        }
        if(front == -1) {
            front = 0;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian index ke " + rear);
    }

    Mahasiswa layaniMahasiswa() {
        if(IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } else if (sudahDilayani >= 30) {
            System.out.println("Dosen Tidak Dapat Menyetujui KRS lagi");
            return null;
        }
        System.out.println("Index ke " + front);
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        sudahDilayani++;
        return mhs;
    }

    int getJumlahAntrian() {
        return size;
    }
    
    int getJumlahSudahDilayani() {
        return sudahDilayani;
    }
}