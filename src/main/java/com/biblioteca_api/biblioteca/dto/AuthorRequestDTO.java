package com.biblioteca_api.biblioteca.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record AuthorRequestDTO(

        @NotBlank(message = "Autor deve ter um nome.") String name,

        @NotNull @Past(message = "Nascimento do autor deve ser no passado.") LocalDate birthDate

) {
}
