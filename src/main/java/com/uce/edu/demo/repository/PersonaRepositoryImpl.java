package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Persona;

@Repository
@Transactional
public class PersonaRepositoryImpl implements IPersonaRepository {
	private static final Logger LOGGER = Logger.getLogger(PersonaRepositoryImpl.class);
	// Interfaz anotacion paa que se inyecte (Manejador de entidades)
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Persona buscarId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		LOGGER.info("Se ha insertado el Persona: " + persona);
		this.entityManager.persist(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		LOGGER.info("Se ha actualizado el Persona: " + persona);
		this.entityManager.merge(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Persona persona = this.buscarId(id);
		LOGGER.info("Se ha eliminado el Persona: " + persona);
		this.entityManager.remove(persona);
	}
	
	@Override
    public List<Persona> buscarTodos() {
        // TODO Auto-generated method stub
        TypedQuery<Persona> miQuery = this.entityManager.createQuery("SELECT p FROM Persona p", Persona.class);
        return miQuery.getResultList();
    }
	

	
}
