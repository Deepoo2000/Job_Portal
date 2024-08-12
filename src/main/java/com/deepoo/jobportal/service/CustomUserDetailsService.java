package com.deepoo.jobportal.service;

import com.deepoo.jobportal.entity.Users;
import com.deepoo.jobportal.repository.UsersRepository;
import com.deepoo.jobportal.uitl.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Autowired
    public CustomUserDetailsService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = usersRepository.findByEmail(username).
                orElseThrow(()->new UsernameNotFoundException("could not found user"));
        return new CustomUserDetails(users);
    }
}
