package com.pritikedar.chocolateria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pritikedar.chocolateria.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
