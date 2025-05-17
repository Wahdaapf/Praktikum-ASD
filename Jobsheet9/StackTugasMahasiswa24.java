public class StackTugasMahasiswa24 {
    Mahasiswa24[] stack;
    int top, size;

    StackTugasMahasiswa24(int size) {
        this.size = size;
        stack = new Mahasiswa24[size];
        top = -1;
    }

    boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Mahasiswa24 mhs) {
        if( !isFull() ) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    Mahasiswa24 pop() {
        if( !isEmpty() ) {
            Mahasiswa24 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    Mahasiswa24 peek() {
        if ( !isEmpty() ) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang di kumpulkan");
            return null;
        }
    }

    Mahasiswa24 peekBottom() {
        if ( !isEmpty() ) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang di kumpulkan");
            return null;
        }
    }

    void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    int countTasks() {
        return top + 1;
    }
}
