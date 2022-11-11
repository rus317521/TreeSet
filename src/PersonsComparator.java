import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
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
}
