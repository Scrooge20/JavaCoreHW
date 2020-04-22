package Lesson5;

public class Employee {
    String firstname;
    String function;
    String email;
    int phone;
    float salary;
    int age;

    public void information(){
        System.out.printf(" Фамилия : %10s Должность : %10s Зарплата : %5.2f Возраст : %4d %n", firstname, function, salary, age);
    }

    public Employee() {
    }

    public Employee(String firstname, String function, float salary, int age) {
        this.firstname = firstname;
        this.function = function;
        this.salary = salary;
        this.age = age;
    }

}
