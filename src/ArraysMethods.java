import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] numbers = {12,67,456,21,93,2,14,45,876,23,6,1,367};

        Arrays.fill(numbers, 2);
//        Заполняет массив одним числом
        Arrays.fill(numbers, 1, 3, 10);
//        Заполняет определенные элементы массива одним числом
        Arrays.copyOf(numbers, 5);
//        Копирует и обрезает массив до определенной длины
    }
}
