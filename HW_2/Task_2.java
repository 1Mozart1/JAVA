/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

package HW_2;
import java.io.IOException;
import java.util.logging.*;
public class Task_2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task_2.class.getName());
        FileHandler log = new FileHandler("D:\\Education\\Java\\HW\\HW_2\\logTask2.xml");
        logger.addHandler(log);
        XMLFormatter xml = new XMLFormatter();
        log.setFormatter(xml);
        logger.info("сортированный массив");
        int [] array = {2, 5, 1, -7, 3, 64, 0};
        lib.printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        lib.printArrayInt(newArr);
    }
    public static int[] listSort(int [] arr){
        for(int i = 0; i < arr.length-1; i++) {
            
            for (int j = 0; j < arr.length - i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    
}