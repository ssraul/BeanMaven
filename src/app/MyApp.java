package app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import crazy.model.client.Cliente;
import crazy.service.client.ClienteService;

public class MyApp {

	public static void main(String[] args) {
		/*
		 * 1.obtener fichero de definicion de los beans, que es contexto de la aplicacion, siempre tiene
		 * que estar en la carpeta "src"
		 * 
		 */
		
		//1.intanciamos el fichero que tenemos de beans, para que lo gestione Spring
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("crazy-beans.xml");
		
		
		ClienteService cs = (ClienteService)appCtx.getBean(ClienteService.class);		
		Cliente nuevo = cs.getCliente("raul@gmail.com");
		System.out.println(nuevo.getNombre());
		System.out.println(nuevo.getApellido());
		System.out.println(nuevo.getEmail());
		
		
//		/**
//		 * Ejercicio anterior
//		 * 
//		 */
//		
//		//obtener un bean, se puede hacer por id o por clase. te obliga a hacerle un cast, es como hacer un new pero ahora lo hace Spring
//		Cliente c1 = (Cliente) appCtx.getBean("cliente1");
//		Cliente c2 = (Cliente) appCtx.getBean("cliente2");
//		
//		
//		//dos maneras de hacerlo:
//		//ClienteService cs = (ClienteService) appCtx.getBean("clienteSrv");
//		ClienteService cs = (ClienteService) appCtx.getBean(ClienteService.class);
//		
//		System.out.println(c2.getNombre());
//		System.out.println(c2.getApellido());
//		System.out.println(c2.getEmail());
//		
//		Cliente c3= cs.getCliente("Raul@gmail.com");
//		
//		System.out.println(c3.getNombre());
//		System.out.println(c3.getApellido());
//		System.out.println(c3.getEmail());
//		
		
		
		
	}

}
