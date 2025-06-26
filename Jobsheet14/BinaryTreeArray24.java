public class BinaryTreeArray24 {
    String[] data = new String[10];
    int idxLast = -1;

    public void populateData() {
        data[0] = "Ali";     
        data[1] = "Budi";   
        data[2] = "Citra";  
        data[3] = "Dina";    
        data[4] = "Eka";   
        idxLast = 4;
    }

    public void traverseInOrder(int index) {
        if (index <= idxLast && data[index] != null) {
            traverseInOrder(2 * index + 1);
            System.out.print(data[index] + " ");
            traverseInOrder(2 * index + 2);
        }
    }
}
