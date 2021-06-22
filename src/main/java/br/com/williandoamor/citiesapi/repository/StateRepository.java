package br.com.williandoamor.citiesapi.repository;

import br.com.williandoamor.citiesapi.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
