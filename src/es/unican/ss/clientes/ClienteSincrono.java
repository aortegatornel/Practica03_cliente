package es.unican.ss.clientes;

import es.unican.ss.seguros.DatosSeguro;
import es.unican.ss.segurosDomain.Aseguradora;
import es.unican.ss.segurosDomain.Cliente;
import es.unican.ss.segurosDomain.Seguro;
import es.unican.ss.segurosDomain.Terceros;
import es.unican.ss.segurosDomain.TodoRiesgo;
import es.unican.ss.segurosDomain.Vehiculo;
import es.unican.www.ss.seguros.DatosNoValidosException;
import es.unican.www.ss.seguros.OperacionesSegurosStub;

public class ClienteSincrono {

	public static void main(String[] args) {
		
		try {			
			OperacionesSegurosStub oss = new OperacionesSegurosStub();
			
			Aseguradora aseguradora = new Aseguradora();
			//crear un cliente completo
			Cliente c1 = new Cliente();
			c1.setDni("12345678A");
			Seguro s1 = new Terceros();
			s1.setId("ABC-123456");
			Vehiculo v1 = new Vehiculo();
			v1.setCv(100);
			v1.setEsProfesional(false);
			s1.setVehiculo(v1);
			c1.anadeSeguro(s1);
			Seguro s2 = new TodoRiesgo();
			s2.setId("DEF-123456");
			Vehiculo v2 = new Vehiculo();
			v2.setCv(70);
			v2.setEsProfesional(true);
			s2.setVehiculo(v2);
			c1.anadeSeguro(s2);
			aseguradora.getClientes().add(c1);	//añadir cliente a la aseguradora
			
			//strings para probar getDatosSeguro
			String datosSeguro = "ABC-123456,lo demás no importa";	
			String datosSeguroMal =  "FGH-159874,lo demñas no importa";
			
			try {
				//invocación válida de getSegurosCliente
				System.out.println("Precio para el cliente " + c1.getDni() + "= " + oss.getSegurosCliente(c1.getDni()));
				
				//invocación inválida de getSegurosCliente
				System.out.println("Precio para el cliente 56789012A = " + oss.getSegurosCliente("56789012A"));
				
				//invocación válida de getDatosSeguro
				DatosSeguro datos = oss.getDatosSeguro(datosSeguro);
				System.out.println("Seguro= " + datos.getId() + "; Tipo= " + datos.getTipoSeguro() + 
						"; Matricula= " + datos.getVehiculo().getMatricula() + "; CV= " + datos.getVehiculo().getCv() + 
						"; Uso profesional= " + datos.getVehiculo().esProfesional());
				
				//invocación inválida de getDatosSeguro
				datos = oss.getDatosSeguro(datosSeguroMal);
				System.out.println("Seguro= " + datos.getId() + "; Tipo= " + datos.getTipoSeguro() + 
						"; Matricula= " + datos.getVehiculo().getMatricula() + "; CV= " + datos.getVehiculo().getCv() + 
						"; Uso profesional= " + datos.getVehiculo().esProfesional());
				
			} catch(DatosNoValidosException e1) {
				System.out.println(e1.getFaultMessage());
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
