package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IDoctorRepo;
import com.example.demo.repo.modelo.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorService{
	
	@Autowired
	private IDoctorRepo doctorRepo;

	@Override
	public void agregar(Doctor d) {
		this.doctorRepo.insertar(d);
	}

	@Override
	public void actualizar(Doctor d) {
		this.doctorRepo.actualizar(d);
	}

	@Override
	public Doctor buscar(String cedula) {
		return this.doctorRepo.seleccionarPorCedula(cedula);
	}

	@Override
	public void borrar(String cedula) {
		this.doctorRepo.eliminar(cedula);
	}
	
	

}
