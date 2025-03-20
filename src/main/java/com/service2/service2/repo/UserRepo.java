package com.service2.service2.repo;


import com.service2.service2.entity.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<TestUser, Long> {
}
