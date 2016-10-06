package crazy.dao;

//será el que acceda a la base de datos
import org.springframework.stereotype.Component;

import crazy.model.client.Cliente;


public class ClientDAO {
	
	public Cliente getCliente(String email){
		
		Cliente c = new Cliente();
		c.setNombre("raul");
		c.setEmail("raul@gmail.com");
		c.setApellido("Sanchez");
	
		return c;
		
	}

}
