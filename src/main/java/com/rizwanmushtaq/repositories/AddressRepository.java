package com.rizwanmushtaq.repositories;

import com.rizwanmushtaq.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
