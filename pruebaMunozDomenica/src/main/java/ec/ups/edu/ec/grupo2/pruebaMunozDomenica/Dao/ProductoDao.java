package ec.ups.edu.ec.grupo2.pruebaMunozDomenica.Dao;

import java.sql.Connection;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.ec.grupo2.pruebaMunozDomenica.Modelo.Producto;



public class ProductoDao {
	@Inject
	private Connection con;
	@Inject
	private EntityManager em;
	
 public boolean insert(Producto entity) {
	 em.persist(entity);
	 return true;
 }
	public void update(Producto producto) throws Exception {
		try {
		em.merge(producto);
		}catch(Exception e) {
		throw new Exception("Error actualizar producto"+e.getMessage());
	}
	}
	
	public List<Producto> getClientes(int id) {
		String jpql= "Select c from Persona c where c.cedula =?1";
		Query q = em.createQuery(jpql, Producto.class);
		q.setParameter(1, id);
		return (List<Producto>) q.getResultList();
	}
	
	public Producto read(int id) throws Exception {
		
		return em.find(Producto.class, id);
		
		
	}
}
