package ordenamientosEstudiantes;
import java.util.Arrays;

public class MiguelSalazar implements JuanLeyva{
    @Override
    public String ordenarAsc(String[] numbers) {

        int[] arr = stringArraytoIntArray(numbers);

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        return Arrays.toString(arr);
    }

    @Override
    public String ordenarDesc(String[] numbers) {

        int[] arr = stringArraytoIntArray(numbers);

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        return Arrays.toString(arr);
    }

    public int[] stringArraytoIntArray(String[] numbers){
        // Se convierte el arreglo de strings a enteros
        int[] arr = new int[numbers.length];
        for (int i=0; i< numbers.length; i++){
            arr[i] = Integer.parseInt(numbers[i]);
        }
        return arr;
    }

}
