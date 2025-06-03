public class Node24 {
    Mahasiswa24 data;
    Node24 prev;
    Node24 next;

    Node24(Mahasiswa24 data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoubleLinkedList24 {
    Node24 head;
    Node24 tail;

    DoubleLinkedList24() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Mahasiswa24 data) {
        Node24 newNode = new Node24(data);
        if(isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Mahasiswa24 data) {
        Node24 newNode = new Node24(data);
        if(isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(String keyNim, Mahasiswa24 data) {
        Node24 current = head;

        while(current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if(current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        Node24 newNode = new Node24(data);
        if(current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node Berhasil Disisipkan Setelah NIM " +  keyNim);
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
        } else {
            Node24 current = head;
            System.out.println("Isi linked list:");
            while (current != null) {
                System.out.println("NIM: " + current.data.nim + ", Nama: " + current.data.nama);
                current = current.next;
            }
        }
    }   

    void removeFirst() {
        if(isEmpty()) {
            System.out.println("List kosong tidak bisa di hapus");
            return;
        }

        Mahasiswa24 dataTerhapus = head.data;

        if(head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + dataTerhapus.nama);
    }

    void removeLast() {
        if(isEmpty()) {
            System.out.println("List kosong tidak bisa dihapus");
            return;
        }
        if(head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    Node24 search(String nim) {
        Node24 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    void add(int index, Mahasiswa24 data) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
    
        Node24 current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
    
        if (current == null) {
            addLast(data);
        } else {
            Node24 newNode = new Node24(data);
            newNode.prev = current.prev;
            newNode.next = current;
            if (current.prev != null) current.prev.next = newNode;
            current.prev = newNode;
        }
    }

    void removeAfter(String keyNim) {
        Node24 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
    
        if (current == null || current.next == null) {
            System.out.println("Tidak ada node setelah NIM tersebut.");
            return;
        }
    
        Node24 toDelete = current.next;
        if (toDelete == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = toDelete.next;
            toDelete.next.prev = current;
        }
    
        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus.");
    }

    void remove(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return;
        }
    
        if (index == 0) {
            removeFirst();
            return;
        }
    
        Node24 current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
    
        if (current == null) {
            System.out.println("Indeks melebihi jumlah node.");
            return;
        }
    
        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.println("Node pada indeks " + index + " berhasil dihapus.");
        }
    }

    void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data pertama:");
            head.data.tampil();
        }
    }
    
    void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        }
    }
    
    void getIndex(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return;
        }
    
        Node24 current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
    
        if (current == null) {
            System.out.println("Indeks melebihi jumlah node.");
        } else {
            System.out.println("Data pada indeks " + index + ":");
            current.data.tampil();
        }
    }

    int size() {
        int count = 0;
        Node24 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
    
}
