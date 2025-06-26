package ppraktikum3;

import java.util.ArrayList;

public class SortCustomerDemo {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(3, "Rara"));
        customers.add(new Customer(1, "Zainab"));
        customers.add(new Customer(2, "Andi"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));

        System.out.println("Setelah disortir berdasarkan nama:");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
