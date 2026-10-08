package com.mx.Carreras.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CARRERAS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carrera {
	
	private int numero;
	private String carrera;
	private String area;
}
