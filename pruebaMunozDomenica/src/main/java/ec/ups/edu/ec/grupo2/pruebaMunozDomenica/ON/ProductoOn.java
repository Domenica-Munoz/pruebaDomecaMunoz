package ec.ups.edu.ec.grupo2.pruebaMunozDomenica.ON;

import java.sql.Connection;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.ec.grupo2.pruebaMunozDomenica.Dao.ClienteDao;
import ec.ups.edu.ec.grupo2.pruebaMunozDomenica.Dao.ProductoDao;
import ec.ups.edu.ec.grupo2.pruebaMunozDomenica.Modelo.Cliente;
import ec.ups.edu.ec.grupo2.pruebaMunozDomenica.Modelo.Producto;

public class ProductoOn {
	
	@Inject
	private ProductoDao daoproducto;
	@Inject
	private ClienteDao daocliente;
	
    public void registrarProducto(Producto producto) throws Exception {
    	daoproducto.insert(producto);
    	
    	
    }

    public void registrarCliente(Cliente cliente) throws Exception {
    	daocliente.insert(cliente);
    	
    	
    }
}
