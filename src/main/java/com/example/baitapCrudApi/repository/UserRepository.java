package com.example.baitapCrudApi.repository;

import com.example.baitapCrudApi.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    public Users findByEmail(String email);
}
