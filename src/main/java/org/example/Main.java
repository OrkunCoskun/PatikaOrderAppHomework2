package org.example;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();

        Customer customer1 = new IndividualCustomer(1, LocalDate.of(2023, Month.FEBRUARY, 1) ,"Orkun Coskun","Orkun","Coşkun",new Invoice(1,450, Month.JULY),new Invoice(2,1900, Month.DECEMBER));
        customerService.addIndividualCustomer((IndividualCustomer) customer1);

        Customer customer2 = new IndividualCustomer(2, LocalDate.of(2023, Month.JUNE, 5), "Deniz Güler", "Deniz","Güler",new Invoice(3,800, Month.JUNE));
        customerService.addIndividualCustomer((IndividualCustomer) customer2);

        Customer customer3 = new IndividualCustomer(3, LocalDate.of(2023, Month.JUNE, 7), "Cansu Yılmaz","Cansu","Yılmaz",new Invoice(4,250, Month.APRIL), new Invoice(5,2000, Month.APRIL));
        customerService.addIndividualCustomer((IndividualCustomer) customer3);

        Customer customer4 = new CorporateCustomer(4,LocalDate.of(2023, Month.MARCH, 12),"DefineX","Consulting, Technology & Labs",new Invoice(6,5500, Month.MAY));
        customerService.addCorporateCustomer((CorporateCustomer) customer4);

        Customer customer5 = new CorporateCustomer(5,LocalDate.of(2023, Month.MARCH, 15),"Patika","Technology, Education",new Invoice(7,600, Month.JUNE));
        customerService.addCorporateCustomer((CorporateCustomer) customer5);

        System.out.println("All Customers");
        System.out.println("----------------------------------------");
        customerService.getAllCustomers();

        System.out.println("----------------------------------------");
        System.out.println("Customers Contain 'C'");
        customerService.getCustomersContainsC();

        System.out.println("----------------------------------------");
        System.out.println("Total Price Of Invoices Of Customers Created In June");
        customerService.getCustomersWithCreatedMonthJune();

        System.out.println("----------------------------------------");
        System.out.println("All Invoices");
        customerService.getAllInvoices();

        System.out.println("----------------------------------------");
        System.out.println("All Invoices Greater Than 1500");
        customerService.getAllInvoicesGreaterThan1500();

        System.out.println("----------------------------------------");
        System.out.println("Average Of Invoices Greater Than 1500");
        customerService.calculateAverageInvoicesGreaterThan1500();

        System.out.println("----------------------------------------");
        System.out.println("All Customers With Invoices Less Than 500");
        customerService.getAllCustomersLessThan500();

        System.out.println("----------------------------------------");
        System.out.println("Sectors of companies with an average invoice of less than 750 in June");
        customerService.getCorporateCustomersFiltered();
    }
}