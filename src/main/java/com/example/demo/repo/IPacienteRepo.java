package com.example.demo.repo;

import com.example.demo.repo.modelo.Paciente;

public interface IPacienteRepo {

	public void insertar(Paciente p);
	public void actualizar(Paciente p);
	public Paciente seleccionarPorCedula(String cedula);
	
}
