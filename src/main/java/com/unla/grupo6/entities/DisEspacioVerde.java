package com.unla.grupo6.entities;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("espacioVerde")
@Table(name="dis_espacio_verde")
public class DisEspacioVerde extends Dispositivo {

	//constructor
	public DisEspacioVerde(String nombre, String descripcion, boolean enFuncionamiento, boolean bajaHumedad,
			float humedad, String sector) {
		super(nombre, descripcion, enFuncionamiento);
		this.bajaHumedad = false;
		this.humedad = humedad;
		this.sector = sector;
	}
	
	@Column(name="bajaHumedad")
	@NotNull(message = "El campo no debe ser nulo")
	private boolean bajaHumedad;
	
	@Column(name="humedad")
	@NotNull(message = "El campo no debe ser nulo")
	private float humedad;
	
	@Column(name="sector")
	@NotNull(message = "El campo no debe estar vacio")
	private String sector;
	
	


//	public DisEspacioVerde() {
//		
//	}


//	// falta el o los metodos
//	public String regar (boolean bajaHumedad) {
//		String riego;
//		
//		if(bajaHumedad == true) {
//			 riego = "EMPAZAR A REGAR";
//		}else {
//			riego = "NO REGAR";
//		}
//		
//		return riego;
//	}
//
//

	
//	public int verificarHumedad() {
//
//        if(humedad < 30)
//            encenderRiego();
//
//        return 1;
//    }
//
//
//    public void encenderRiego() {
//        regar = true; 
//    }
}
