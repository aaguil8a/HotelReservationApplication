package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import model.Customer;



public class CustomerService {
    public static CustomerService customerService = null;
    public static List<Customer> customers = new ArrayList<>();

    // provide a static refence  
    public String email;
    public String firstName;
    public String lastName;
    public String customerEmail;
     
    public CustomerService() {}


    // constructor
    public CustomerService(String email, String firstName, String lastName, String customerEmail) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerEmail = customerEmail;

    }

    public static CustomerService getInstance() {
        if(customerService == null) {
            customerService = new CustomerService();
        }
        return customerService;
    }

    public static void addCustomer(String email, String firstName, String lastName) {
        customers.add(new Customer(email, firstName, lastName));
    }

    public Customer getCustomer(String customerEmail) {
        for (Customer customer : customers) {
            if (customer.email.equals(customerEmail)) {
                return customer;
            }
        }
        return null;
    }

    public Collection<Customer> getAllCustomers() {
        return customers;
    }
        

}


    



   

  

