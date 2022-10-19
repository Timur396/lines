public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        //task3();

    }

    public static void task1() {

        System.out.println(" Задача№1");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich ";
        String fullName = firstName + middleName + lastName;
        System.out.println(fullName);


        System.out.println(" Задача№2");
        String fullName1 = fullName.toUpperCase();
        System.out.println(fullName1);

    }

    public static void task2() {
        System.out.println(" Задача№3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);


    }
}