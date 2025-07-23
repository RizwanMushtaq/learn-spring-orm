package com.rizwanmushtaq.services;

import com.rizwanmushtaq.entities.Address;

import java.util.List;

public interface AddressService {
  Address saveAddress(Address Address);

  Address updateAddress(Address Address, int AddressId);

  Address deleteAddress(int AddressId);

  List<Address> getAllAddresses();

  Address getAddressById(int AddressId);
}
