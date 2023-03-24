package ordenamientosEstudiantes;

import java.util.Arrays;

public class DiegoBermudez implements JuanLeyva{

	@Override
	public String ordenarAsc(String[] numbers) {
		for(int i = 0; i < numbers.length - 1; i++) {
	         int minIndex = i;
	         for(int j = i + 1; j < numbers.length; j++) {
	            if(Integer.parseInt(numbers[j]) < Integer.parseInt(numbers[minIndex])) {
	               minIndex = j;
	            }
	         }
	         int temp = Integer.parseInt(numbers[i]);
	         numbers[i] = numbers[minIndex];
	         numbers[minIndex] = Integer.toString(temp);
	      }

		return ("Sorted Array : " + Arrays.toString(numbers));
	}

	@Override
	public String ordenarDesc(String[] numbers) {
		for(int i = 0; i < numbers.length - 1; i++) {
	         int minIndex = i;
	         for(int j = i + 1; j < numbers.length; j++) {
	            if(Integer.parseInt(numbers[j]) > Integer.parseInt(numbers[minIndex])) {
	               minIndex = j;
	            }
	         }
	         int temp = Integer.parseInt(numbers[i]);
	         numbers[i] = numbers[minIndex];
	         numbers[minIndex] = Integer.toString(temp);
	      }

		return ("Sorted Array : " + Arrays.toString(numbers));
	}

}
