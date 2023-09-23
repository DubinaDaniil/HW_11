package customer;

import java.util.*;

public class CustomersDB {

    private final List<Customer> dataSource;

    public CustomersDB() {
        dataSource = new ArrayList<>();
        dataSource.add(new Customer(1, "Daniil"));
        dataSource.add(new Customer(2, "Olga"));
        dataSource.add(new Customer(3, "Elena"));
        dataSource.add(new Customer(4, "Viktor"));
        dataSource.add(new Customer(5, "Egor"));
        dataSource.add(new Customer(6, "Ekaterina"));
        dataSource.add(new Customer(7, "Svetlana"));
        dataSource.add(new Customer(8, "Valentina"));
        dataSource.add(new Customer(9, "Alexandr"));
        dataSource.add(new Customer(10, "Mikhail"));
    }

    public Customer getById(final int id) {
        return dataSource.get(id);
    }

    public List<Customer> getAllCustomers() {
        return dataSource;
    }
}
