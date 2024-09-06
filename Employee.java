public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }
   @Override
    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone_number, salary, age);
    }
    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Василий Уткин", "Генеральный директор", "v752@primer,ru", "+79996665544", 500000, 20);
        persArray[1] = new Employee("Иван найцев", "Директор по развитию", "v752@primer,ru", "+79998884455", 107000, 40);
        persArray[2] = new Employee("Дмитрий Медведев", "Охранник", "d27532@primer,ru", "+79997771234", 19500, 21);
        persArray[3] = new Employee("Олег Лиси", "Ведущий разработчик", "o141@primer,ru", "+79995554789", 17000, 28);
        persArray[4] = new Employee("Кристина Волкова", "Директор по работе с клиентами", "k752@primer,ru", "+79994445896", 138000, 48);
    }
}