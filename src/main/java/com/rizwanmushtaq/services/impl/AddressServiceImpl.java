package com.rizwanmushtaq.services.impl;

import com.rizwanmushtaq.entities.Address;
import com.rizwanmushtaq.repositories.AddressRepository;
import com.rizwanmushtaq.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
  @Autowired
  private AddressRepository addressRepository;

  @Override
  public Address saveAddress(Address Address) {
    return addressRepository.save(Address);
  }

  @Override
  public Address updateAddress(Address Address, int AddressId) {
    Address existingAddress =
        addressRepository.findById(AddressId).orElseThrow(
            () -> new RuntimeException("Address not found with id: " + AddressId));
    existingAddress.setStreet(Address.getStreet());
    existingAddress.setCity(Address.getCity());
    existingAddress.setState(Address.getState());
    existingAddress.setZipCode(Address.getZipCode());
    return addressRepository.save(existingAddress);
  }

  @Override
  public Address deleteAddress(int AddressId) {
    Address address = addressRepository.findById(AddressId)
        .orElseThrow(() -> new RuntimeException("Address not found with id: " + AddressId));
    addressRepository.delete(address);
    return address;
  }

  @Override
  public List<Address> getAllAddresses() {
    return addressRepository.findAll();
  }

  @Override
  public Address getAddressById(int AddressId) {
    return addressRepository.findById(AddressId).orElseThrow(
        () -> new RuntimeException("Address not found with id: " + AddressId)
    );
  }
}
