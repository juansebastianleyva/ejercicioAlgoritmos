package launcher;

import ordenamientosEstudiantes.NicolasPinzon;

public class Pruebas {

	static NicolasPinzon np = new NicolasPinzon();	

	public static void main(String[]args) {
		
		String[] num= {"56","12","64","34","87","56"};	
		
		np.ordenarAsc(num);
		np.ordenarDes(num);
	}
	
}
