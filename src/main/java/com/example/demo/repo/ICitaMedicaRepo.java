package com.example.demo.repo;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.demo.repo.modelo.CitaMedica;

public interface ICitaMedicaRepo {

	public void insertar(CitaMedica cm);
	public void actualizarPorNumCita(String numeroCita);
	
	
}
