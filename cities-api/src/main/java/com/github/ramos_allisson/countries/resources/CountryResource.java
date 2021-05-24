package com.github.ramos_allisson.countries.resources;

import com.github.ramos_allisson.countries.entities.Country;
import com.github.ramos_allisson.countries.repositories.CountryRepository;
import java.util.List;

import com.github.ramos_allisson.countries.repositories.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@RestController
public class CountryResource {

  private final CountryRepository repository;

  public CountryResource(final CountryRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/countries")
  public List<Country> cities() {

    return repository.findAll();
  }
}
