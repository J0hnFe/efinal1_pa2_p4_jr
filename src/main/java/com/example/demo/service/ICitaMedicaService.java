package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface ICitaMedicaService {
	
	public void agendar(String nCita, LocalDate fCita, BigDecimal valorCita, String lugarCita, String cedDoctor, String cedPaciente);
	public void actualizarPorNumCita(String diagnostico, String receta, LocalDate fechaProxCita);
	

}
