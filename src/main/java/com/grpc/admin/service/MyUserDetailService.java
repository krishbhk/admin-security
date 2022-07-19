package com.grpc.admin.service;

import com.grpc.admin.entity.Admin;
import com.grpc.admin.entity.MyUserDetails;
import com.grpc.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return new MyUserDetails(username);

        Optional<Admin> adminData = adminRepository.findByName(username);

        adminData.orElseThrow(()-> new UsernameNotFoundException("Not Found: "+ username));

        //TODO: PASS ALL FIELDS TO MY_USER_DETAILS
        return adminData.map(MyUserDetails::new).get();


    }
}
