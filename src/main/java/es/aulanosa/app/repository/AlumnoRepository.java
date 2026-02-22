package es.aulanosa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import es.aulanosa.app.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    /*
        Por defecto se generan
            * save()
            * findAll()
            * findById()
            * deleteById()
     */
}