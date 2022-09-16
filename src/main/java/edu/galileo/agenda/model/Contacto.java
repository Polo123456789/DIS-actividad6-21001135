package edu.galileo.agenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Contacto")
@Data
public class Contacto {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String telefono;
}
