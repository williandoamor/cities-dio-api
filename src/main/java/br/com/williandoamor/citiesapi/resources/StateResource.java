package br.com.williandoamor.citiesapi.resources;

import br.com.williandoamor.citiesapi.entities.State;
import br.com.williandoamor.citiesapi.repository.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
@AllArgsConstructor(onConstructor = @_(@Autowired))
public class StateResource {

    private final StateRepository repository;

    @GetMapping
    public List<State> staties() {

        return repository.findAll();
    }

}
