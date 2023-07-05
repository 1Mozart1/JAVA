
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение


import java.util.*;

public class Task {
    public static void main(String[] args) {
        List<Integer> list_num = new ArrayList(Arrays.asList(4, 23, 6, 9, 18, 39, 4, 37, 17, 3));
        System.out.println("Изначальный список: " + list_num);
        System.out.println("Минимальное значение: " + minNum(list_num));
        System.out.println("Максимальное значение: " + maxNum(list_num));
        System.out.println("Среднее значение: " + average(list_num));
        removeEven(list_num);
        
    }
 
    
     
    public static void removeEven(List<Integer> list) {
    for (int i=0; i < list.size()-1; i++) {
        if (list.get(i) % 2 == 0) {
         list.remove(i);
        }
        } 
        System.out.println("Остаток после удаления чётных: " + list);
        
    }
    public static Integer maxNum(List<Integer> list) {
        int max = list.get(0); 
        for (int i=0; i < list.size()-1; i++) {
            if  (list.get(i) > max) {
                max = list.get(i);
            }
        } 
        return max;
    }
    public static Integer minNum(List<Integer> list) {
        int min = list.get(0); 
        for (int i=0; i < list.size()-1; i++) {
            if  (list.get(i) < min) {
                min = list.get(i);
            }
        } 
        return min;
    }
    public static Double average(List<Integer> list) {
        int sum = 0; 
        double average ;
        for (int i=0; i < list.size()-1; i++) {
            sum += list.get(i);
        } 
        average  = sum / list.size();
        return average ;
    }

    
}
