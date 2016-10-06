package crazy.dao;

//será el que acceda a la base de datos
import org.springframework.stereotype.Component;

import crazy.model.client.Cliente;


//el Component indica que es un Bean
//<context:component-scan base-package="crazy.dao"></context:component-scan>
@Component
public class ClientDAO {
	
	public Cliente getCliente(String email){
		
		Cliente c = new Cliente();
		c.setNombre("raul");
		c.setEmail("raul@gmail.com");
		c.setApellido("Sanchez");
	
		return c;
		
	}

}
