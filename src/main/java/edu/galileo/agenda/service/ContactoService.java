package edu.galileo.agenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.galileo.agenda.model.Contacto;
import edu.galileo.agenda.model.repository.ContactoRepository;

@Service
public class ContactoService {
    @Autowired
    private ContactoRepository contactoRepository;

    public Contacto add(Contacto contacto) {
        return this.contactoRepository.save(contacto);
    }

    public List<Contacto> list() {
        return this.contactoRepository.findAll();
    }

}
