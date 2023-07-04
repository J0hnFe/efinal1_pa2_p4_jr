package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.ICitaMedicaRepo;
import com.example.demo.repo.IDoctorRepo;
import com.example.demo.repo.IPacienteRepo;
import com.example.demo.repo.modelo.CitaMedica;
import com.example.demo.repo.modelo.Doctor;
import com.example.demo.repo.modelo.Paciente;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Autowired
	private IPacienteRepo pacienteRepo;
	
	@Autowired
	private ICitaMedicaRepo citaMedicaRepo;
	
	@Override
	public void agendar(String nCita, LocalDate fCita, BigDecimal valorCita, String lugarCita, String cedDoctor,
			String cedPaciente) {
		
		Doctor doctorAux = this.doctorRepo.seleccionarPorCedula(cedPaciente);
		Paciente pacienteAux = this.pacienteRepo.seleccionarPorCedula(cedPaciente);
		
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setnCita(nCita);
		citaMedica.setfCita(fCita);
		citaMedica.setValorCita(valorCita);
		citaMedica.setLugarCita(lugarCita);
		citaMedica.setDoctor(doctorAux);
		citaMedica.setPaciente(pacienteAux);
		
		this.citaMedicaRepo.insertar(citaMedica);
		
	}

	@Override
	public void actualizarPorNumCita(String diagnostico, String receta, LocalDate fechaProxCita) {
		
		
	}

}
