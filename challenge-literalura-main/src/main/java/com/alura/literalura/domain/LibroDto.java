package com.alura.literalura.domain;

import com.alura.literalura.model.entity.Autor;
import com.alura.literalura.model.entity.Libro;

import java.util.stream.Collectors;

public record LibroDto(
        String titulo,
        String tema,
        String idioma,
        Integer descargas,
        String autores
) {
    public LibroDto(Libro libro) {
        this(
                libro.getTitulo(),
                libro.getTemas(),
                libro.getIdioma().getNombre(),
                libro.getContadorDeDescargas(),
                libro.getAutores()
                        .stream()
                        .map(Autor::getNombre)
                        .collect(Collectors.joining(", "))
        );
    }

    @Override
    public String toString() {
        return """
                --------- LIBRO ---------
                Titulo: %s
                Autor: %s
                Idioma: %s
                Numero de descargas: %d
                -------------------------
                """.formatted(
                titulo,
                autores,
                idioma,
                descargas);
    }
}
