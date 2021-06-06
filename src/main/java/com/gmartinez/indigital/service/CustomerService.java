package com.gmartinez.indigital.service;

import com.gmartinez.indigital.exceptions.CustomerException;
import com.gmartinez.indigital.model.Customer;
import com.gmartinez.indigital.model.Statistic;
import java.util.List;

public interface CustomerService {

    void createCustomer(Customer customer) throws CustomerException;

    Statistic getStatistic() throws CustomerException;

    List<Customer> getCustomers() throws CustomerException;

}
