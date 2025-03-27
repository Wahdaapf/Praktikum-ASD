public class test {
    public static void main(String[] args) {
        int data[] = {23, 35, 7, 14, 67};
        for (int i = 0; i < data.length -1; i++) {
            int min = i;
            for (int j = i+1; j < data.length; j++) {
                if(data[j] > data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
            for(int k = 0; k < data.length; k++) {
                System.out.print(data[k] + " ");
            }
            System.out.println();
        }
    }
}