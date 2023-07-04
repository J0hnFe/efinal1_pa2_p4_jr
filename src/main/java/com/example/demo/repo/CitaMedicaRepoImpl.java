package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CitaMedica cm) {
		this.entityManager.persist(cm);
		
	}

	@Override
	public void actualizarPorNumCita(String numeroCita) {
		// TODO Auto-generated method stub
		
	}



}
