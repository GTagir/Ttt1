package lesson5new;

public class employee {
    private String fio;
    private String position;
    private String email;
    private String telefon;
    private int salary;
    private int age;

    public employee(String fio, String position, String email, String telefon, int salary, int age) {
        this.fio = fio;
        this.position = position; //Должность
        this.email = email;
        this.telefon = telefon;
        this.salary = salary; //зарплата
        this.age = age;
    }

    @Override
    public String toString() {
        return "employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void printInfo() {
        System.out.println(this);
    }

    public int getAge() {
        return age;
    }
}