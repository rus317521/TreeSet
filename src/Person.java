public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[] getArraySurname() {
        String[] arraySurname;
        if(surname.contains("-")) {
        arraySurname = surname.split("-");}
        else {arraySurname = surname.split(" ");}
        return arraySurname;
    }

    public String toString() {
        return name + " " + surname + " " + age;
    }

}