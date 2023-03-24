public class Main {
    public static void main(String[] args) {
        //Задача 5
        int value5 = 33;
        value5 =
        changeValue5(value5);
        System.out.println(value5);

        //Задача 6
        Integer value6 = 33;
        value6 =
        changeValue6(value6);
        System.out.println(value6);
        //Задача 7
        Integer[] value7 = {3,4};
        changeValue8(value7);
        System.out.println(value7[0]+value7[1]);
        //Задача 8
        Integer[] value8 = {3,4};
        changeValue8(value8);
        System.out.println(value8[0]+value8[1]);
        Person person = new Person("Ilya", "Lagutenko");
        person.changePerson10(person);
        System.out.println("person.toString() = " + person.toString());

    }
    public static int changeValue5(int value5) {
        value5 = 22;
        return value5;
    }
    public static Integer changeValue6(Integer value) {
        value = 22;
        return value;
    }
    public static Integer[] changeValue7(Integer[] value){
        value = new Integer[]{2, 1};
        return  value;
    }
    public static Integer[] changeValue8(Integer[] value){
        value[0] = 99;
        return  value;
    }


}