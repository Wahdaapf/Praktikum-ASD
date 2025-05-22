public class AntrianLayanan {
    Mahasiswa[] data;
    int front, rear, size, max;

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
            System.out.print("Mahasiswa Terdepan : ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian Kosong");
        }
    }

    void lihatTerbelakang() {
        if(!IsEmpty()) {
            System.out.print("Mahasiswa Terbelakang : ");
            System.out.println("NIM - Nama - Prodi - Kelas");
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
            System.out.println("NIM - Nama - prodi - Kelas");
            for(int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i+1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    int getJumlahAntrian() {
        return size;
    }

    void clear() {
        if(!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void tambahAntrian(Mahasiswa mhs) {
        if(IsFull()) {
            System.out.println("Antrian sudah penuh tidak dapat menambahkan mahasiswa");
            return;
        } 

        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
        
    }

    Mahasiswa layaniMahasiswa() {
        if(IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } 

        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
}