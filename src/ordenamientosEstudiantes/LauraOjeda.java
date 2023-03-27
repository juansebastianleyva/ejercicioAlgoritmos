package ordenamientoEstudiantes;

public class LauraOjeda implements JuanLeyva{

    public String ordenarAsc(String[] numbers) {
        int n = numbers.length;
        String temp = "";
        boolean sorted = false;
    
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (numbers[i].compareTo(numbers[i+1]) > 0) {
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    sorted = false;
                }
            }
            n--;
        }
        
        return Arrays.toString(numbers);
    }

    public String ordenarDesc(String[] numbers){
        for (int x = 0; x < numbers.length; x++) {
            for (int y = 0; y < numbers.length - 1; y++) {
                String elementoActual =numbers[y],
                        elementoSiguiente = numbers[y + 1];
                if (elementoActual.compareTo(elementoSiguiente) < 0) {
                    // Intercambiar
                    numbers[y] = elementoSiguiente;
                    numbers[y + 1] = elementoActual;
                    }
                }
            }
            return Arrays.toString(numbers);
        }

}
