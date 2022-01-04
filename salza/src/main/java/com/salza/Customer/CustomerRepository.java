package com.salza.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
