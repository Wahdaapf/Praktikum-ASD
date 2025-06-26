public class BinaryTree24 {
    Node24 root;
    BinaryTree24() {
        root = null;
    }
    boolean isEmpty() {
        return root == null;
    }
    void add(Mahasiswa24 data) {
        Node24 newNode = new Node24(data);
        if(isEmpty()) {
            root = newNode;
        } else {
            Node24 current = root;
            Node24 parent = null;
            while(true) {
                parent = current;
                if(data.ipk < current.data.ipk) {
                    current = current.left;
                    if(current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if(current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    boolean find(double ipk) {
        boolean result = false;
        Node24 current = root;
        while(current != null) {
            if(current.data.ipk == ipk) {
                result = true;
                break;
            } else if(ipk > current.data.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }
    void traversePreOrder(Node24 node) {
        if(node != null) {
            node.data.tampilkanInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node24 node) {
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.tampilkanInformasi();
        }
    }
    void traverseInOrder(Node24 node) {
        if(node != null) {
            traverseInOrder(node.left);
            node.data.tampilkanInformasi();
            traverseInOrder(node.right);
        }
    }
    Node24 getSuccessor(Node24 del) {
        Node24 successor = del.right;
        Node24 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    void delete(double ipk) {
        if(isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node24 parent = root;
        Node24 current = root;
        boolean isLeftChild = false;
        while(current != null) {
            if(current.data.ipk == ipk) {
                break;
            } else if(ipk < current.data.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(ipk > current.data.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null){
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null){
                if (current == root){
                    root = null;
                } else {
                    if (isLeftChild){
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // jika hanya punya 1 anak (kanan)
                if (current == root){
                    root = current.right;
                } else {
                    if (isLeftChild){
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // jika hanya punya 1 anak (kiri)
                if (current == root){
                    root = current.left;
                } else {
                    if (isLeftChild){
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // jika punya 2 anak
                Node24 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.data.tampilkanInformasi();
            
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
            
                successor.left = current.left;
            }
        }
    }
}
