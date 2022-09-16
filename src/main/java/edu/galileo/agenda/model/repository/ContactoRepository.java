package edu.galileo.agenda.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.galileo.agenda.model.Contacto;

public interface ContactoRepository extends CrudRepository<Contacto, Integer> {
    List<Contacto> findAll();
}
