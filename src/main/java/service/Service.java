package service;

import java.util.List;

import Entity.Customer;

public interface Service 
{
    public List<Customer> getAllCustomer();
    
    public List<Customer> findByplanName(String planName);
    
    public List<Customer> findByplanStatus(String planStatus);
}
