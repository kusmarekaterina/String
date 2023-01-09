public class Main {
    public static void main(String[] args) {
        task1of3();
    }

    public static void task1of3() {
        String firstName = "Иван";
        String middleName = "Семёнович";
        String lastName = "Семёнов";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullName2 = fullName.replace('ё', 'е');
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("Данные ФИО сотрудника — " + fullName2);
    }

}