package acciones;

import Ubicacion.Ubicacion;
import main.Juego;

public class Moverse extends Accion{ // TODO: hecho, falta armar tests.

	
	Ubicacion ubicacionActual;
	Juego juego;
	
	public Moverse(Juego juego) {
		
		this.ubicacionActual = juego.getUbicacion();
		this.juego = juego;
		nombre = "moverse";
	}
	

	/* NOTA: usamos clases para cada accion para luego poder aplicar algun patron de dise�o. 
			 Habria que unificar la interfaz de todas las acciones con un objeto propertires*/
	public void accionar(Ubicacion nuevaLocation) {
	
		Ubicacion ubicacion = juego.getUbicacion();
		
		if(ubicacion.sePuedeMoverAConexion(nuevaLocation)) {	
			juego.setLocation(nuevaLocation);
		}else {
			System.out.println("no podes moverte ahi");
		}
	}

}
