package com.alura.literalura.repository;

import com.alura.literalura.model.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {

    /**
     * Este método recupera una lista de entidades Autor que estaban vivas en un año específico.
     * Utiliza una consulta personalizada para filtrar los autores en función de sus años de nacimiento y fallecimiento.
     *
     * @param anio El año para verificar los autores vivos.
     * @return Una lista de entidades Autor que estaban vivas en el año especificado.
     */
    @Query("SELECT a FROM Autor a WHERE a.anhioDeNacimiento <= :anio AND a.anhioDeFallecimiento > :anio")
    List<Autor> obtenerAutoresVivosPorAnio(int anio);
}
