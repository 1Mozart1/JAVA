/*  Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
1) Умножьте два числа и верните произведение в виде связанного списка.
2) Сложите два числа и верните сумму в виде связанного списка.
Одно или два числа могут быть отрицательными.
*/


package HW_4;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


public class Task {
    public static void main(String[] args) {

        
        Deque<String> list_1 = new LinkedList<>(Arrays.asList("3","2"));
        Deque<String> list_2 = new LinkedList<>(Arrays.asList("3","2"));
                           
        int first_num = makeInt(list_1);
        int second_num = makeInt(list_2);
        int composition = first_num * second_num;
        System.out.printf("%d * %d = %d\n", first_num, second_num, composition);
        
        System.out.println();
        System.out.println("Результат: ");
        System.out.println(Pack(composition));
           
    }
    
    static int makeInt(Deque<String> arr) {
        int result=0; 
        String inS;   
        int krat = 1; 

        while(arr.size() != 0) {
            inS = arr.pollFirst();
            if (!inS.equals("-")) {
                result = result + krat * (Integer.parseInt(inS));
                krat *= 10;
            } else {
                result *= -1;
            }
        }
        return result;
    }

    static Queue<String> Pack(int in) {
        Deque<String> q = new LinkedList<>();
        int temp = 0;
        boolean negative = false;
        if (in < 0) {
            in *= -1;
            negative = true; 
        }
        while (in > 0) {
            temp = in % 10;
            in = (in - temp) / 10;
            q.addFirst(Integer.toString(temp));
        }
        if (negative) {
            q.addFirst("-");
        }
        return q;
    }

    // public static void main(String[] args) {

        
    //     Deque<String> list_1 = new LinkedList<>(Arrays.asList("3","2","1"));
    //     Deque<String> list_2 = new LinkedList<>(Arrays.asList("7","4","-"));
                           
    //     int first_num = makeInt(list_1);
    //     int second_num = makeInt(list_2);
    //     int composition = first_num * second_num;
    //     System.out.printf("%d * %d = %d\n", first_num, second_num, composition);
        
    //     System.out.println();
    //     System.out.println("Результат: ");
    //     System.out.println(Pack(composition));
           
    // }
    
}