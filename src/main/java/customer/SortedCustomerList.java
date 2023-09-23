package customer;

import java.util.*;

public class SortedCustomerList {

    public List<Customer> sortByEvenIds(final CustomersDB customersDB) {
        return customersDB.getAllCustomers().stream()
                .filter(customer -> customer.getId() % 2 != 0)
                .toList();
    }

    public List<Customer> sortByOddIds(final CustomersDB customersDB) {
        return customersDB.getAllCustomers().stream()
                .filter(customer -> customer.getId() % 2 == 0)
                .toList();
    }

    public List<String> customerNameToUpperCase(final CustomersDB customersDB) {
        return customersDB.getAllCustomers().stream()
                .map(customer -> customer.getName().toUpperCase())
                .toList();
    }

    public List<String> sortCustomerNameByBackwardsLettersToUpperCase(final CustomersDB customersDB) {
        return customerNameToUpperCase(customersDB)
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }


}
