package com.alura.literalura.repository;

import com.alura.literalura.model.entity.Idioma;
import com.alura.literalura.model.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface LibroRepository extends JpaRepository<Libro, Long> {

    /**
     * Este método recupera una lista de entidades Libro que están en un idioma específico.
     * Utiliza una consulta personalizada para filtrar los libros en función de su idioma.
     *
     * @param idioma El idioma de los libros a buscar.
     * @return Una lista de entidades Libro que están en el idioma especificado.
     */
    @Query("SELECT l FROM Libro l WHERE l.idioma = :idioma")
    List<Libro> obtenerLibrosPorIdioma(Idioma idioma);

    /**
     * Este método busca un libro por su título.
     *
     * @param titulo El título del libro a buscar.
     * @return Un Optional que puede contener el Libro si se encuentra.
     */
    Optional<Libro> findByTitulo(String titulo);
}
