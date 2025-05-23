package Tugas;

public class Antrian24 {
    Node24 front, rear;
    int size = 0;

    public Antrian24() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return (front == null);
    }

    public void enqueue(Mahasiswa24 mhs) {
        Node24 newNode = new Node24(mhs, null);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang bisa dipanggil.");
            return;
        }
        System.out.println("Memanggil mahasiswa: ");
        front.data.tampilkanInformasi();
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public void tampilkanDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            front.data.tampilkanInformasi();
        }
    }

    public void tampilkanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            rear.data.tampilkanInformasi();
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node24 temp = front;
        System.out.println("Daftar mahasiswa dalam antrian:");
        while (temp != null) {
            temp.data.tampilkanInformasi();
            temp = temp.next;
        }
    }
}
