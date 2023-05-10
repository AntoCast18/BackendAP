/*
*/
package com.proyecto.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto.proyecto.Entity.Persona;
import java.util.Optional;

/**
 *
 * @author Antonella
 */

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer>{
        public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);

}
