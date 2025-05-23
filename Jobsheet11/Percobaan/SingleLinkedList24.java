package Percobaan;
public class SingleLinkedList24 {
    Node24 head;
    Node24 tail;

    boolean isEmpty() {
        return (head == null);
    }

    void print() {
        if(!isEmpty()) {
            Node24 tmp = head;
            System.out.println("Isi linked list : \t");
            while(tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    void addFirst(Mahasiswa24 input) {
        Node24 ndInput = new Node24(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa24 input) {
        Node24 ndInput = new Node24(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(String key, Mahasiswa24 input) {
        Node24 ndInput = new Node24(input, null);
        Node24 temp = head;
        do {
            if(temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, Mahasiswa24 input) {
        if(index < 0) {
            System.out.println("Index Salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node24 temp = head;
            for(int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = new Node24(input, temp.next);
            if(temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    void getData(int index) {
        Node24 tmp = head;
        for(int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilkanInformasi();
    }

    int indexOf(String key) {
        Node24 tmp = head;
        int index = 0;
        while(tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if(tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if(isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if(isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node24 tmp = head;
            while(tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    void remove(String key) {
        if(isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else {
            Node24 tmp = head;
            while(tmp != null) {
                if((tmp.data.nama.equalsIgnoreCase(key)) && (tmp == head)) {
                    tmp.next = tmp.next.next;
                    if(tmp.next == null) {
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    void removeAt(int index) {
        if(index == 0) {
            removeFirst();
        } else {
            Node24 tmp = head;
            for(int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if(tmp.next == null) {
                tail = tmp;
            }
        }
    }
}
