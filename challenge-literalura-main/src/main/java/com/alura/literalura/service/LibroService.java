package com.alura.literalura.service;

import com.alura.literalura.repository.LibroRepository;
import com.alura.literalura.domain.LibroDto;
import com.alura.literalura.model.DatosLibro;
import com.alura.literalura.model.entity.Idioma;
import com.alura.literalura.model.entity.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository repository;

    /**
     * Este método guarda un libro en la base de datos.
     * Si el libro ya existe, devuelve el libro existente.
     *
     * @param libro El libro a guardar.
     * @return El libro guardado o el libro existente.
     */
    public LibroDto guardarLibro(DatosLibro datos) {
        Optional<Libro> nuevo = repository.findByTitulo(datos.titulo());

        if(!nuevo.isPresent()) {
            Libro libro = repository.save(new Libro(datos));
            return new LibroDto(libro);
        } else {
            System.out.println("El libro ya existe en la base de datos");
        }

        return new LibroDto(nuevo.get());
    }

    /**
     * Este método recupera un Libro por su ID.
     *
     * @param id El ID del libro a buscar.
     * @return El Libro si se encuentra, o null.
     */
    public LibroDto obtenerLibroPorId(Long id) {
        return repository.findById(id).map(LibroDto::new).orElse(null);
    }

    /**
     * Este método recupera una lista de todas las entidades Libro.
     *
     * @return Una lista de entidades Libro.
     */
    public List<LibroDto> obtenerLibros() {
        return repository.findAll().stream()
                .map(LibroDto::new)
                .toList();
    }

    /**
     * Este método recupera una lista de entidades Libro que están en un idioma específico.
     *
     * @param idioma El idioma de los libros a buscar.
     * @return Una lista de entidades Libro que están en el idioma especificado.
     */
    public List<LibroDto> obtenerLibrosPorIdioma(Idioma idioma) {
        return repository.obtenerLibrosPorIdioma(idioma).stream()
                .map(LibroDto::new)
                .toList();
    }
}
