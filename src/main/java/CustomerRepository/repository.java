package CustomerRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Customer;

public interface repository extends JpaRepository<Customer,Integer> {

}
