import concat_steam.*;
import customer.*;

public class Main {
    public static void main(String[] args) {

        CustomersDB customersDB = new CustomersDB();

        SortedCustomerList sortedCustomerList = new SortedCustomerList();

        System.out.println("sortedByEvenIds " + sortedCustomerList.sortByEvenIds(customersDB));
        System.out.println();

        System.out.println("sortedByOddIds " + sortedCustomerList.sortByOddIds(customersDB));
        System.out.println();

        System.out.println("customerNameToUpperCase " + sortedCustomerList.customerNameToUpperCase(customersDB));
        System.out.println();

        System.out.println("sortCustomerNameByBackwardsLettersToUpperCase " + sortedCustomerList.sortCustomerNameByBackwardsLettersToUpperCase(customersDB));
        System.out.println();

        ConcatStream concatStream = new ConcatStream();
        System.out.println(concatStream.concat());

    }
}