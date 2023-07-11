package HW_5;
import java.util.*;
/*
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
 */

public class Task {
    public static HashMap<String, ArrayList> contacts = new HashMap<>();

    public static void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            ArrayList phoneNumbers = contacts.get(name);
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        } else {
            ArrayList phoneNumbers = new ArrayList();
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        }
    }

    public static void printAndSortContacts() {
        ArrayList<Map.Entry<String, ArrayList>> list = new ArrayList(contacts.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList>>() {
        public int compare(Map.Entry<String, ArrayList> o1, Map.Entry<String, ArrayList> o2) {
            return o2.getValue().size() - o1.getValue().size();
            }
        });
        
        for (Map.Entry<String, ArrayList> entry : list) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        addContact("Иванов", "123-456");
        addContact("Петров", "123-451");
        addContact("Сидоров", "123-452");
        addContact("Иванов", "123-453");
        addContact("Петров", "123-454");
        addContact("Петров", "123-459");
        printAndSortContacts();

    }
}
