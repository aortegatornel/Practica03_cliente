package es.unican.ss.segurosDomain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@SuppressWarnings({ "serial" })
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TodoRiesgo")
public class TodoRiesgo extends Seguro implements Serializable{
	
	public TodoRiesgo(){
		super();
		this.precioBase=600.0;
	}
	
	@Override
	public double calculaPrecio() {
		double precio= precioBase+vehiculo.getCv()*1.5;
		if(vehiculo.esProfesional()){
			precio+=100.0;
		}
		return precio;
	}
}
