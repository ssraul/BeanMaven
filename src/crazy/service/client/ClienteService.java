package crazy.service.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import crazy.dao.ClientDAO;
import crazy.model.client.Cliente;

@Component
public class ClienteService {
	
	//es la que vamos a utilizar para acceder a los clientes
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
