package com.example.demo.repo.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {

	@Id
	@SequenceGenerator(name = "seq_doctor", sequenceName = "seq_doctor", allocationSize = 1)
	@GeneratedValue(generator = "seq_doctor", strategy = GenerationType.SEQUENCE)
	@Column(name = "doct_id")
	private Integer id;
	@Column(name = "doct_cedula")
	private String cedula;
	@Column(name = "doct_nombre")
	private String nombre;
	@Column(name = "doct_apellido")
	private String apellido;
	@Column(name = "doct_fecha_nacimiento")
	private LocalDate fNacimiento;
	@Column(name = "doct_numero_consultorio")
	private String nConsultorio;
	@Column(name = "doct_codigo_senescyt")
	private String codSenescyt;
	@Column(name = "doct_genero")
	private String genero;
	
	
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
	private List<CitaMedica> citasMedicas;

	//toString
//	@Override
//	public String toString() {
//		return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
//				+ ", fNacimiento=" + fNacimiento + ", nConsultorio=" + nConsultorio + ", codSenescyt=" + codSenescyt
//				+ ", genero=" + genero + ", citasMedicas=" + citasMedicas + "]";
//	}

	//Getters y Setters
	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDate getfNacimiento() {
		return fNacimiento;
	}


	public void setfNacimiento(LocalDate fNacimiento) {
		this.fNacimiento = fNacimiento;
	}


	public String getnConsultorio() {
		return nConsultorio;
	}


	public void setnConsultorio(String nConsultorio) {
		this.nConsultorio = nConsultorio;
	}


	public String getCodSenescyt() {
		return codSenescyt;
	}


	public void setCodSenescyt(String codSenescyt) {
		this.codSenescyt = codSenescyt;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public List<CitaMedica> getCitasMedicas() {
		return citasMedicas;
	}


	public void setCitasMedicas(List<CitaMedica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}


	public Integer getId() {
		return id;
	}
	
	
}
