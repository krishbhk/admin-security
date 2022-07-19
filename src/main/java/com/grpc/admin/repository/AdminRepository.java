package com.grpc.admin.repository;

import com.grpc.admin.entity.Admin;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Optional<Admin> findByName(String name);


}
