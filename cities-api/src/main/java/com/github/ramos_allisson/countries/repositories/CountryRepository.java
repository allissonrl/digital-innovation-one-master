package com.github.ramos_allisson.countries.repositories;

import com.github.andrelugomes.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
