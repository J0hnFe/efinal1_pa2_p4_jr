package com.example.demo.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.print.Doc;
import javax.swing.plaf.basic.BasicDesktopIconUI;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cita_medica")
public class CitaMedica {

	@Id
	@SequenceGenerator(name = "seq_cita_medica", sequenceName = "seq_cita_medica", allocationSize = 1)
	@GeneratedValue(generator = "seq_cita_medica", strategy = GenerationType.SEQUENCE)
	@Column(name = "cime_id")
	private Integer id;
	@Column(name = "cime_numero_cita")
	private String nCita;
	@Column(name = "cime_fecha_cita")
	private LocalDate fCita;
	@Column(name = "cime_valor_cita")
	private BigDecimal valorCita;
	@Column(name = "cime_lugar_cita")
	private String lugarCita;
	@Column(name = "cime_diagnostico")
	private String diagnostico;
	@Column(name = "cime_receta")
	private String receta;
	@Column(name = "cime_proxima_cita")
	private LocalDate proxCita;
	
	@ManyToOne
	@JoinColumn(name = "cime_id_paciente")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "cime_id_doctor")
	private Doctor doctor;

	//toString
	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", nCita=" + nCita + ", fCita=" + fCita + ", valorCita=" + valorCita
				+ ", lugarCita=" + lugarCita + ", diagnostico=" + diagnostico + ", receta=" + receta + ", proxCita="
				+ proxCita + ", paciente=" + paciente + ", doctor=" + doctor + "]";
	}

	//Getters y Setters
	public String getnCita() {
		return nCita;
	}

	public void setnCita(String nCita) {
		this.nCita = nCita;
	}

	public LocalDate getfCita() {
		return fCita;
	}

	public void setfCita(LocalDate fCita) {
		this.fCita = fCita;
	}

	public BigDecimal getValorCita() {
		return valorCita;
	}

	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}

	public String getLugarCita() {
		return lugarCita;
	}

	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	public LocalDate getProxCita() {
		return proxCita;
	}

	public void setProxCita(LocalDate proxCita) {
		this.proxCita = proxCita;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Integer getId() {
		return id;
	}

		
}
