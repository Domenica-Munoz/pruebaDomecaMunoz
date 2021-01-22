package ec.ups.edu.ec.grupo2.pruebaMunozDomenica.Dao;

import java.sql.Connection;
import java.util.List;

import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.ec.grupo2.pruebaMunozDomenica.Modelo.Cliente;


@Stateful
public class ClienteDao {
	@Inject
	private Connection con;
	@Inject
	private EntityManager em;
	
 public boolean insert(Cliente entity) {
	 em.persist(entity);
	 return true;
 }
	public void update(Cliente cliente) throws Exception {
		try {
		em.merge(cliente);
		}catch(Exception e) {
		throw new Exception("Error actualizar Cliente"+e.getMessage());
	}
	}
	
	public List<Cliente> getClientes(String cedula) {
		String jpql= "Select c from Persona c where c.cedula =?1";
		Query q = em.createQuery(jpql, Cliente.class);
		q.setParameter(1, cedula);
		return (List<Cliente>) q.getResultList();
	}
	
	public Cliente read(String cedula) throws Exception {
		
		return em.find(Cliente.class, cedula);
		
		
	}
}
