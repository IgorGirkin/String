
public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        firstName += " ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        middleName += " ";
        lastName += " ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName + ".");
       //Задание 2
        System.out.println("Задание 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());
        //Задание 3
        System.out.println("Задание 3");
        //Решение 1
        var fullNameIvan = fullName.split(" ");
        fullNameIvan[0]="Иванов";
        fullNameIvan[1]="Семён";
        fullNameIvan[2]="Семёнович";
        System.out.print("Данные ФИО сотрудника — ");
        for (int i = 0; i <fullNameIvan.length; i++) {
            if (fullNameIvan[i].contains("ё")) {
           fullNameIvan[i]=fullNameIvan[i].replace("ё","е");}
            System.out.print(fullNameIvan[i]);
            if (i<fullNameIvan.length-1) {
                System.out.print(" ");
            }
        }
       System.out.println(".");
  //      // Решение 2
  //       String fullName2 ="Иванов Семён Семёнович";
  //      fullName2= fullName2.replace("ё","е");
  //      System.out.println("Данные ФИО сотрудника — "+fullName2);
    }
}
