public class Main {
    public static void main(String[] args) {

        String phone = "+960-415-75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length()==10) {
//            phone = '7' + phone;
        } else if (phone.length()>11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length()==11 && phone.charAt(0) !='7') {
            throw new RuntimeException("Среди нас посторонний!");
          }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }


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