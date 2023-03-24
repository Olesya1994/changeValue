public class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return  name + '\'' + surname + '\'';
    }
    void changePerson9(Person person){
        person=new Person("Ilya", "LagutenKo");

    }
    void changePerson10(Person person){
        person.name = "Lyapis";
        person.surname = "Trubetskoy";
    }
}
