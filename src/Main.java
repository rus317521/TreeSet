import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Van Burren", 16));
        persons.add(new Person("Aleksandr", "Vasilyev", 45));
        persons.add(new Person("Petr", "Ponkratov-Cherniy", 19));
        persons.add(new Person("Apostol", "Mamin-Sibiryak", 12));
        persons.add(new Person("Alsu", "Abdrazakova", 40));

        persons.removeIf((Person person) -> person.getAge()<18);

        Collections.sort(persons, new PersonsComparator());
        System.out.println(persons);
    }
}