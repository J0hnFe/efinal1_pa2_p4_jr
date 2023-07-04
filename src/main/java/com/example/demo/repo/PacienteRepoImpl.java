package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Doctor;
import com.example.demo.repo.modelo.Paciente;

import ch.qos.logback.core.model.conditional.ElseModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Paciente p) {
		this.entityManager.persist(p);
	}

	@Override
	public void actualizar(Paciente p) {
		this.entityManager.merge(p);
	}

	@Override
	public Paciente seleccionarPorCedula(String cedula) {
		TypedQuery<Paciente> query = this.entityManager.createQuery("SELECT p FROM Paciente p WHERE p.cedula = :datoCedula", Paciente.class);
		query.setParameter("datoCedula", cedula);
		return query.getSingleResult();
	}

	
}
