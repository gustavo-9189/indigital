package com.gmartinez.indigital.service;

import com.gmartinez.indigital.exceptions.CustomerException;
import com.gmartinez.indigital.model.Customer;
import com.gmartinez.indigital.model.Statistic;
import com.gmartinez.indigital.repository.CustomerRepository;
import com.gmartinez.indigital.utils.StatisticUtils;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

    private CustomerRepository customerRepository;
    private StatisticUtils statisticUtils;

    @Autowired
    public CustomerServiceImpl(
            CustomerRepository customerRepository,
            StatisticUtils statisticUtils) {
        this.customerRepository = customerRepository;
        this.statisticUtils = statisticUtils;
    }

    @Override
    public void createCustomer(Customer customer) throws CustomerException {
        try {
            int age = statisticUtils.getAge(customer.getDateOfBirth());
            customer.setAge(age);
            customerRepository.save(customer);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new CustomerException(e.getMessage());
        }
        log.info("Cliente agregado con exito");
    }

    @Override
    public Statistic getStatistic() throws CustomerException {

        Statistic statistic = new Statistic();
        try {
            List<Customer> customers = customerRepository.findAll();
            Double average = statisticUtils.getAverage(customers);
            Double standardDeviation = statisticUtils.getStandardDeviation(customers, average);
            statistic.setAverage(average);
            statistic.setStandardDeviation(standardDeviation);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new CustomerException(e.getMessage());
        }
        log.info("Estadisticas, promedio: {} desviacion estandar: {}",
                statistic.getAverage(),
                statistic.getStandardDeviation()
        );
        return statistic;
    }

    @Override
    public List<Customer> getCustomers() throws CustomerException {

        List<Customer> customers;
        try {
            customers = customerRepository.findAll();
            statisticUtils.setDateOfDeath(customers);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new CustomerException(e.getMessage());
        }
        log.info("Lista todos los clientes con la fecha probable de muerte");
        return customers;
    }

}
