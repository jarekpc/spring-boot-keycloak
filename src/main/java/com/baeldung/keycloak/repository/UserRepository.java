package com.baeldung.keycloak.repository;

import com.baeldung.keycloak.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
