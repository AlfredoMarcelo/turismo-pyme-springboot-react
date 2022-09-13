package com.turismo.pyme.pymebackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {
  private Long id;
  private String nombre;
  private String email;
  private String telefono;
  private String biografia;
  private String ubicacion;
  private String horario;
  private Double valor;
}
