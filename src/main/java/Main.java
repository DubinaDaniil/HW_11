import concat_steam.*;
import customer.*;
import randomizer.*;
import zip.*;

import java.util.*;
import java.util.stream.*;

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
        System.out.println("Case 1: concat mass " + concatStream.concat());

        String[] mass = new String[]{"1, 2, 0", "4, 5", "12, 52, 30", "4", "5", "1", "2, 0", "4, 5, 7, 8"};
        System.out.println("Case 2: concat mass " + concatStream.concatGiven(mass));
        System.out.println();

        RandomNumbers randomNumbers = new RandomNumbers();
        System.out.println("random Numbers" + randomNumbers.random(10));
        System.out.println();

        Stream<Integer> firstStream = Stream.of(1, 2, 0);
        Stream<Integer> secondStream = Stream.of(4, 5, 6, 7, 8);
        System.out.println(Arrays.toString(Zip.zip(firstStream, secondStream).toArray()));

    }
}