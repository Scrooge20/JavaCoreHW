package Lesson5;

public class Company {

    public static void main(String[] args) {
//        Employee sidorov = new Employee();
//        sidorov.firstname = "Sidorov";
//        sidorov.function = "manager";
//        sidorov.phone = 333444555;
//        sidorov.age = 30;
//        sidorov.salary = 2367.567f;
//
//        Employee sotrudnik1 = new Employee("Petrov", 1000.77f, 33);
//
//
//        sidorov.information();
//        sotrudnik1.information();

        Employee [] marketingDepartment = new Employee[5];
        marketingDepartment[0] = new Employee("Sidorov", "programmer", 1111.11f,21);
        marketingDepartment[1] = new Employee("Petrov", "programmer", 2222.22f,31);
        marketingDepartment[2] = new Employee("Ivanov", "manager", 3333.33f,41);
        marketingDepartment[3] = new Employee("Belov", "manager", 4444.44f,44);
        marketingDepartment[4] = new Employee("Sorokin", "Director", 10000.55f,51);

        for (Employee mdEmployee : marketingDepartment) {
            if (mdEmployee.age>=40) {
                mdEmployee.information();
                continue;
            }
        }
        System.out.println(" Всего сотрудников : " + marketingDepartment.length);

    }


}
