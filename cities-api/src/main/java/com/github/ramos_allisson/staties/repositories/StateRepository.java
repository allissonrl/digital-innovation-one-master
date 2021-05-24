package com.github.ramos_allisson.staties.repositories;

import com.github.ramos_allisson.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
