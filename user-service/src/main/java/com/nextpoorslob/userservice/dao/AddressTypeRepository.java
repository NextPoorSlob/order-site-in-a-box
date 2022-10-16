package com.nextpoorslob.userservice.dao;

import com.nextpoorslob.userservice.model.AddressType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressTypeRepository extends JpaRepository<AddressType, Integer> {
}
