package com.baeldung.keycloak.repository;

import com.baeldung.keycloak.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<Events, String> {
}
