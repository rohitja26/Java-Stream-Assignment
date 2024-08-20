import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private String gender;
    private String department;
    private double salary;
    private int yearOfJoining;

    // Constructor
    public Employee(String name, int age, String gender, String department, double salary, int yearOfJoining) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for gender
    public String getGender() {
        return gender;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Getter for yearOfJoining
    public int getYearOfJoining() {
        return yearOfJoining;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", gender=" + gender +
                ", department=" + department + ", salary=" + salary +
                ", yearOfJoining=" + yearOfJoining + "]";
    }
}

 public  class main {
     public static void main(String[] args) {
         List<Employee> employees = Arrays.asList(
                 new Employee("Alice", 30, "Female", "HR", 60000, 2016),
                 new Employee("Bob", 25, "Male", "IT", 75000, 2018),
                 new Employee("Charlie", 28, "Male", "Finance", 70000, 2014),
                 new Employee("Diana", 35, "Female", "IT", 80000, 2012),
                 new Employee("Eve", 22, "Female", "HR", 55000, 2020)
         );

//    1. How many male and female employees are there in the organization?

         Map<String, Long> genderCount = employees.stream()
                 .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
         System.out.println(genderCount);


//     2. Print the name of all departments in the organization.

//         employees.stream()
//                 .map(Employee::getDepartment)
//                 .distinct()
//                 .forEach(System.out::println);

//      3. What is the average age of male and female employees?

//         Map<String, Double> averageAgeByGender = employees.stream()
//                 .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//         System.out.println(averageAgeByGender); // {Male=..., Female=...}

//    4. Get the details of the highest paid and second highest paid employee in the organization.

//         List<Employee> topTwoPaidEmployees = employees.stream()
//                 .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//                 .limit(2)
//                 .collect(Collectors.toList());
//         System.out.println("Highest Paid: " + topTwoPaidEmployees.get(0));
//         System.out.println("Second Highest Paid: " + topTwoPaidEmployees.get(1));

//
//     5. Get the names of all employees who have joined after 2015.

//         employees.stream()
//                 .filter(e -> e.getYearOfJoining() > 2015)
//                 .map(Employee::getName)
//                 .forEach(System.out::println);
//
//      6. Count the number of employees in each department.
//
//         Map<String, Long> employeesCountByDepartment = employees.stream()
//          .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//          System.out.println(employeesCountByDepartment);
//
//      7. What is the average salary of each department.

//         Map<String, Double> averageSalaryByDepartment = employees.stream()
//                 .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//         System.out.println(averageSalaryByDepartment);

//8. Who has the most working experience in the organization?

//     Employee mostExperiencedEmployee = employees.stream()
//             .sorted(Comparator.comparingInt(Employee::getYearOfJoining))
//             .findFirst()
//             .orElse(null);
//      System.out.println(mostExperiencedEmployee);

//   9. Get the details of the youngest male employee in each department.

//         Map<String, Optional<Employee>> youngestMaleInEachDept = employees.stream()
//                 .filter(e -> e.getGender().equalsIgnoreCase("Male"))
//                 .collect(Collectors.groupingBy(Employee::getDepartment,
//                         Collectors.minBy(Comparator.comparingInt(Employee::getAge))));
//
//         youngestMaleInEachDept.forEach((dept, emp) ->
//                 System.out.println("Dept: " + dept + ", Youngest Male: " + emp.orElse(null)));

//     10. What is the average salary and total salary of the whole organization?

//        DoubleSummaryStatistics salaryStatistics = employees.stream()
//    .collect(Collectors.summarizingDouble(Employee::getSalary));
//
//      System.out.println("Average Salary: " + salaryStatistics.getAverage());
//      System.out.println("Total Salary: " + salaryStatistics.getSum());
//

 }}

