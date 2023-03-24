package ordenamientosEstudiantes;

public class AndresCardenas implements JuanLeyva {

    public String ordenarAsc(String[] numbers);
    public String ordenarDesc(String[] numbers);

    public AndresCardenas() {


        public String ordenarAsc (String[]numbers){
            int[] numbersInt = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                numbersInt[i] = Integer.parseInt(numbers[i]);
            }
            for (int i = 0; i < numbersInt.length; i++) {
                for (int j = 0; j < numbersInt.length - 1; j++) {
                    if (numbersInt[j] > numbersInt[j + 1]) {
                        int temp = numbersInt[j];
                        numbersInt[j] = numbersInt[j + 1];
                        numbersInt[j + 1] = temp;
                    }
                }
            }
            String result = "";
            for (int i = 0; i < numbersInt.length; i++) {
                result += numbersInt[i] + " ";
            }
            return result;
        }

        public String ordenarDesc (String[]numbers){
            int[] numbersInt = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                numbersInt[i] = Integer.parseInt(numbers[i]);
            }
            for (int i = 0; i < numbersInt.length; i++) {
                for (int j = 0; j < numbersInt.length - 1; j++) {
                    if (numbersInt[j] < numbersInt[j + 1]) {
                        int temp = numbersInt[j];
                        numbersInt[j] = numbersInt[j + 1];
                        numbersInt[j + 1] = temp;
                    }
                }
            }
            String result = "";
            for (int i = 0; i < numbersInt.length; i++) {
                result += numbersInt[i] + " ";
            }
            return result;
        }
    }
}
