public class MainApp {
    public static int summArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (String[] strings : array) {
            if (array.length != 4 || strings.length != 4) {
                throw new MyArraySizeException("Размер массива отличается от 4x4!");
            }
        }
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удалось преобразовать в число в строке " + (i+1) + ", столбце " + (j+1));
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String[][] a = {
                {"2", "34", "23", "145"},
                {"4", "387", "45", "15"},
                {"9", "6", "34", "24"},
                {"4", "56", "17", "3"}
        };
        try {
            System.out.println("Сумма элементов массива: " + summArray(a));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
