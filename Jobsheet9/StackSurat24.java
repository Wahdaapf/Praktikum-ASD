public class StackSurat24 {
    Surat24[] stack;
    int top, size;

    StackSurat24(int size) {
        this.size = size;
        stack = new Surat24[size];
        top = -1;
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if( top == -1 ) {
            return true;
        } else {
            return false;
        }
    }

    void push( Surat24 srt ) {
        if ( !isFull() ) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack Penuh!");
        }
    }

    Surat24 pop() {
        if ( !isEmpty() ) {
            Surat24 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack Kosong");
            return null;
        }
    }

    Surat24 peek() {
        if ( !isEmpty() ) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong!");
            return null;
        }
    }

    void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].namaMahasiswa + "\t" + stack[i].idSurat + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    Surat24 cariSurat(String nama) {
        for (int i = 0; i <= top; i++ ) {
            if(nama.equalsIgnoreCase(stack[i].namaMahasiswa)) {
                return stack[i];
            }
        }
        return null;
    }
}
