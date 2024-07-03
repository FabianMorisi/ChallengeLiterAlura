package com.alura.literalura.service;

import com.alura.literalura.repository.AutorRepository;
import com.alura.literalura.domain.AutorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    /**
     * Este método recupera una lista de todas las entidades Autor.
     *
     * @return Una lista de entidades Autor.
     */
    public List<AutorDto> obtenerAutores() {
        return repository.findAll().stream()
                .map(autor -> new AutorDto(autor))
                .toList();
    }

    /**
     * Este método recupera una lista de entidades Autor que estaban vivas en un año específico.
     *
     * @param anio El año para verificar los autores vivos.
     * @return Una lista de entidades Autor que estaban vivas en el año especificado.
     */
    public List<AutorDto> obtenerAutoresVivosPorAnio(int anio) {
        return repository.obtenerAutoresVivosPorAnio(anio).stream()
                .map(autor -> new AutorDto(autor))
                .toList();
    }
}
