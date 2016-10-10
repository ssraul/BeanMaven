package crazy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//será el que acceda a la base de datos
import org.springframework.stereotype.Component;

import crazy.model.client.Cliente;


//el Component indica que es un Bean
//<context:component-scan base-package="crazy.dao"></context:component-scan>
@Component//le estamos diciendo que esto es un bean
public class ClientDAO {
	
	@Autowired//auto inyectable para que lo sepa Spring
	//@Qualifier("beanname")para darle un nombre al datasource, hay que añadirle el id al bean de la conexion
	DataSource datasource;

	public DataSource getDatasource() {
		return datasource;
	}


	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public Cliente getCliente(String email){
		
		Cliente cliente = null;
		String consulta ="select * from cliente where email= ?";
		Connection conn = null;
		
		try {
			conn = datasource.getConnection();
			PreparedStatement ps = conn.prepareStatement(consulta);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				cliente= new Cliente();
				cliente.setNombre(rs.getString("nombre"));
				cliente.setEmail(rs.getString("email"));
				cliente.setApellido(rs.getString("apellido"));
			}
			rs.close();
			ps.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return cliente;
		
		
	}

}
