package example.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotBlank;

import example.domain.Owner;
import example.repositories.OwnerRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;

@Controller("/owners")
@RequiredArgsConstructor
class OwnerController {

    private final OwnerRepository ownerRepository;

    @Get("/")
    List<Owner> all() {
        return ownerRepository.findAll();
    }

    @Get("/{name}")
    Optional<Owner> byName(@NotBlank String name) {
        return ownerRepository.findByName(name);
    }
}
