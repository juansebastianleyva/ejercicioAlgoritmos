package ordenamientosEstudiantes;

public class NicolasPinzon {
    
    public void ordenarAsc(String[] numero) {
        System.out.println();
        String aux;
        for(int i = 1; i < numero.length; i++) {
            for (int j = 0; j < numero.length-i; j++) {
                if (numero[j].compareTo(numero[j+1])<0) {
                   aux = numero[j];
                   numero[j] = numero[j+1];
                   numero[j+1] = aux;
                }
            }
	}
        System.out.println("Numeros ordenados de forma ascendiente: ");
        for (int i = 0; i < numero.length; i++) {
        	if(i == numero.length-1) {
        		System.out.print(numero[i]);
        	}else {
        		System.out.print(numero[i]+",");
        	}
        } 
    }
    
        public void ordenarDes(String[] numero) {
        System.out.println();
        String aux;
        for(int i = 1; i < numero.length; i++) {
            for (int j = 0; j < numero.length-i; j++) {
                if (numero[j].compareTo(numero[j+1])>0) {
                   aux = numero[j];
                   numero[j] = numero[j+1];
                   numero[j+1] = aux;
                }
            }
	}
        System.out.println("Numeros ordenados de forma descendiente: ");
        for (int i = 0; i < numero.length; i++) {
        	if(i == numero.length-1) {
        		System.out.print(numero[i]);
        	}else {
        		System.out.print(numero[i]+",");
        	}
        } 
    }
    
}



