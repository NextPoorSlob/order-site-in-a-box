package com.nextpoorslob.userservice.dao;

import com.nextpoorslob.userservice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
