package crazy.service.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import crazy.dao.ClientDAO;
import crazy.model.client.Cliente;


//el Component indica que es un Bean tenemos que añadir en el fichero de beans
//<context:component-scan base-package="crazy.service.client"></context:component-scan>
@Component
public class ClienteService {
	
	//es el equivalente a la referencia
	@Autowired
	private ClientDAO clDAO;
	
	
	//genera getters y setters
	public ClientDAO getClDAO() {
		return clDAO;
	}



	public void setClDAO(ClientDAO clDAO) {
		this.clDAO = clDAO;
	}

	

	//metodos
	public Cliente getCliente(String email){
		return clDAO.getCliente(email);
		
	}
}
