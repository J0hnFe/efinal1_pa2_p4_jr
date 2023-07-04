package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Doctor;
import com.example.demo.repo.modelo.Paciente;
import com.example.demo.service.ICitaMedicaService;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IPacienteService;

@SpringBootApplication
public class Efinal1Pa2P4JrApplication implements CommandLineRunner{

	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4JrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		LocalDate fechaNacimientoDoc1 = LocalDate.of(1980, 1, 9);
		LocalDate fechaNacimientoPac1 = LocalDate.of(1970, 1, 9);
		
		Doctor doctor1 = new Doctor();
		doctor1.setNombre("Fernando");
		doctor1.setApellido("De Magallanes");
		doctor1.setCedula("001");
		doctor1.setCodSenescyt("2468");
		doctor1.setfNacimiento(fechaNacimientoDoc1);
		doctor1.setGenero("M");
		doctor1.setnConsultorio("10");
		
		Paciente paciente1 = new Paciente();
		paciente1.setNombre("Juana");
		paciente1.setApellido("De Arco");
		paciente1.setCedula("002");
		paciente1.setCodSeguro("1357");
		paciente1.setEstatura("1.80");
		paciente1.setfNacimiento(fechaNacimientoPac1);
		paciente1.setGenero("F");
		paciente1.setPeso("70");
		
//		this.doctorService.agregar(doctor1);
//		this.pacienteService.agregar(paciente1);		
		
//		paciente1.setNombre("Maria");
//		this.pacienteService.actualizar(paciente1);
		
		String numCita = "555";
		LocalDate fechaCita = LocalDate.of(2023, 2, 2);
		BigDecimal valorCita = new BigDecimal(55);
		String lugarCita = "Av. America";
		
		this.citaMedicaService.agendar(lugarCita, fechaCita, valorCita, lugarCita, "001", "002");
		
		
		
	}

}
