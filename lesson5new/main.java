package lesson5new;

public class main {
    public static void main(String[] args) {
        employee[] employees = new employee[5];
        employees[0] = new employee("Ivanov Ivan Ivanovich", "Driver", "gfdhth@mail.ru", "89123456879", 35000, 50);
        employees[1] = new employee("Petrov Petr Petrovich", "Cook", "gfdhth@mail.ru", "89123456879", 30000, 18);
        employees[2] = new employee("Vasilev Vasiliy Vasilevich", "Engineer", "gfdh@mail.ru", "89123456879", 25000, 42);
        employees[3] = new employee("Sidorov Sidr Sidorovich", "Builder", "gfdhth@mail.ru", "89123456879", 20000, 58);
        employees[4] = new employee("Iurov Iuriy Iurievich", "Doctor", "gfdhth@mail.ru", "89123456879", 15000, 20);

        for (employee employee: employees) {
            if (employee.getAge() > 40){
                employee.printInfo();
            }
        }
    }
}