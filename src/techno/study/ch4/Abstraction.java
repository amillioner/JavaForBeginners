package techno.study.ch4;

/**
 * abstract, extend
 * <p>
 * reusable code
 */
public class Abstraction {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Ali");
        System.out.println(employee.getInfo());

        Student student = new Student();
        student.setName("Max");
        student.setGrade("11A");
        System.out.println(student.getInfo());

        //how to use abstraction
        Person[] persons = new Person[2];
        persons[0] = employee;
        persons[1] = student;

        for (Person person : persons) {
            System.out.println(person.getInfo());
        }
    }

    //TODO Task
    //  0. create abstract class "Animal" with at least 4 abstract methods and extend classes from it
}

abstract class Person {
    private String name;

    public abstract String getInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {

    @Override
    public String getInfo() {
        return getName();
    }
}

class Student extends Person {

    private String grade;

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return this.grade;
    }

    @Override
    public String getInfo() {
        return getName() + " " + getGrade();
    }
}