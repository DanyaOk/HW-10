public class Main {
    public static void main(String[] args) {


        String firstName = "Иванов " ;
        String middleName = "Семён ";
        String lastName = "Семёнович ";
        String fullName = firstName+middleName+lastName;
        System.out.println("Ф. И. О. сотрудника - "+fullName);

        String fullName1 = fullName.toUpperCase();
        System.out.print("Данные Ф. И. О. сотрудника для заполнения отчета — "+fullName1);
        System.out.println();
        String fullName3 = fullName;
        fullName3 = fullName3.replace("ё", "е");
        System.out.print("Данные Ф. И. О. сотрудника — "+fullName3);



    }
}