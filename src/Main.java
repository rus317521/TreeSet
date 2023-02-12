import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Van Burren", 46));
        persons.add(new Person("Aleksandr", "Vasilyev", 45));
        persons.add(new Person("Petr", "Ponkratov-Cherniy", 40));
        persons.add(new Person("Apostol", "Mamin-Sibiryak", 50));

        Comparator<Person> comparator = (o1,o2) -> {
            int count1 = o1.getArraySurname().length;
            int count2 = o2.getArraySurname().length;
            if (count1 > count2) {
                return 1;
            } else if (count1 < count2) {
                return -1;
            } else {
                return o1.getAge() - o2.getAge();
            }
        }

        Collections.sort(persons, comparator);
        System.out.println(persons);
    }
}