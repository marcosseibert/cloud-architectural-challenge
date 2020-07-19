package com.seibert.cloudarchitecturalchallenge.repository;

import com.seibert.cloudarchitecturalchallenge.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
