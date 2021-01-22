package ec.ups.edu.ec.grupo2.pruebaMunozDomenica.Servicio;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ec.ups.edu.ec.grupo2.pruebaMunozDomenica.Modelo.Producto;
import ec.ups.edu.ec.grupo2.pruebaMunozDomenica.ON.ProductoOn;


public class ResetService {
	 @Inject
	 private ProductoOn pro;
	 
	 
	 @POST
	 @Produces("application/json")
	 @Consumes("applicacion/json")
	 @Path("prueba")
	 
	 public void registrar(Producto producto)throws Exception {
			pro.registrarProducto(producto);
			}
	 
	 
	 

}
