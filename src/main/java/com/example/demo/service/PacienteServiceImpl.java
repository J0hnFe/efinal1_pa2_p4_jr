package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IPacienteRepo;
import com.example.demo.repo.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepo pacienteRepo;
	
	@Override
	public void agregar(Paciente p) {
		this.pacienteRepo.insertar(p);
		
	}

	@Override
	public void actualizar(Paciente p) {
		this.pacienteRepo.actualizar(p);
	}

	
	
}
