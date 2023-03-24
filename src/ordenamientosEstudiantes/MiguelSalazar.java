package ordenamientosEstudiantes;

public class MiguelSalazar implements JuanLeyva{
    @Override
    public String ordenarAsc(String[] numbers) {

        int[] arr = stringArraytoIntArray(numbers);


        return null;
    }

    @Override
    public String ordenarDesc(String[] numbers) {
        return null;
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
