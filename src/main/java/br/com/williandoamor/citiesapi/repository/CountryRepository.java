package br.com.williandoamor.citiesapi.repository;

import br.com.williandoamor.citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
