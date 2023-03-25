
package ordenamientosEstudiantes;

import java.util.Arrays;

public class VictorCespedes implements JuanLeyva{

	@Override
	public String ordenarAsc(String[] numbers) {
		for(int i = 0; i < numbers.length - 1; i++) {
	         int min = i;
	         for(int j = i + 1; j < numbers.length; j++) {
	            if(Integer.parseInt(numbers[j]) < Integer.parseInt(numbers[min])) {
	               min = j;
	            }
	         }
	         int temp = Integer.parseInt(numbers[i]);
	         numbers[i] = numbers[min];
	         numbers[min] = Integer.toString(temp);
	      }

		return ("Array Ordenado : " + Arrays.toString(numbers));
	}

	@Override
	public String ordenarDesc(String[] numbers) {
		for(int i = 0; i < numbers.length - 1; i++) {
	         int min = i;
	         for(int j = i + 1; j < numbers.length; j++) {
	            if(Integer.parseInt(numbers[j]) > Integer.parseInt(numbers[min])) {
	               min = j;
	            }
	         }
	         int temp = Integer.parseInt(numbers[i]);
	         numbers[i] = numbers[min];
	         numbers[min] = Integer.toString(temp);
	      }

		return ("Array Ordenado : " + Arrays.toString(numbers));
	}
}
