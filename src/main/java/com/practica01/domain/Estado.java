package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable {
    private static final long serialVersionUID=1L;  /*asigna automaticamente el numero de id de los clientes*/
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPais;
    
    private String nombre;
    private int costas;
    private int habitantes;
    private String nacionalidad;
    private String capital;
    private String ciudad;

    public Estado() {
    }

    public Estado(Long idPais, String nombre, int costas, int habitantes, String nacionalidad, String capital, String ciudad) {
        this.idPais = idPais;
        this.nombre = nombre;
        this.costas = costas;
        this.habitantes = habitantes;
        this.nacionalidad = nacionalidad;
        this.capital = capital;
        this.ciudad = ciudad;
    }

   

 
      
       
    }
    
    


