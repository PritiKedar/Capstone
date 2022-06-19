package com.pritikedar.chocolateria.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.pritikedar.chocolateria.dto.UserRegistrationDto;
import com.pritikedar.chocolateria.model.User;

public interface UserService extends UserDetailsService {
   User findByEmail(String email);
   User save(UserRegistrationDto registration);
}

