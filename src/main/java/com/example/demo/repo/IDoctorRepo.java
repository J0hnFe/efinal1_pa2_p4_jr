package com.example.demo.repo;

import com.example.demo.repo.modelo.Doctor;

public interface IDoctorRepo {

	public void insertar(Doctor d);
	public void actualizar(Doctor d);
	public Doctor seleccionarPorCedula(String cedula);
	public void eliminar(String cedula);
	
}
