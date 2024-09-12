package pbl05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        people.add(new Student("ana", 20, "ana@student.com", "87654321", "Engenharia de Software"));
        people.add(new Student("carlos", 22, "carlos@student.com", "11223344", "Ciência da Computação"));
        people.add(new Student("julia", 18, "julia@student.com", "55667788", "Engenharia Elétrica"));

        people.add(new Teacher("roberto", 45, "roberto@teacher.com", "Matemática", 4500.0));
        people.add(new Teacher("fernanda", 39, "fernanda@teacher.com", "Física", 4800.0));
        people.add(new Teacher("paulo", 50, "paulo@teacher.com", "Química", 5200.0));

        people.add(new Employee("maria", 35, "maria@employee.com", "Administração", 40, 15.0));
        people.add(new Employee("josé", 40, "jose@employee.com", "Segurança", 45, 14.0));
        people.add(new Employee("lucas", 30, "lucas@employee.com", "Manutenção", 38, 13.0));

        people.add(new Monitor("bruna", 23, "bruna@monitor.com", "34567890", "Direito"));
        people.add(new Monitor("felipe", 24, "felipe@monitor.com", "45678901", "Medicina"));
        people.add(new Monitor("aline", 22, "aline@monitor.com", "56789012", "Arquitetura"));

        while (true){
            System.out.println("Bem-vindo\n Lista de Pessoas na Escola:");
            for(Person person: people){
                System.out.println(person.getName());
            }
            System.out.println("Digite o nome de quem deseja ver mais detalhes: ");
            String name = input.nextLine().toLowerCase();
            int notFound = 0;
            for(Person person : people){
                if(person.getName().equals(name)){
                    System.out.printf("Esta é a pessoa que deseja vizualizar?(Digite Sim ou Não)\n%s ", person.getName());
                    String option = input.nextLine().toLowerCase();
                    if(option.equals("sim")){
                        person.introduce();
                        notFound = 1;
                    }
                    else{
                        continue;
                    }
                }
                else{
                    continue;
                }
            }
            if(notFound == 0){
                System.out.println("Pessoa não encontrada");
            }
        }

    }
}

class Person{
    protected String name;
    protected int age;
    protected String email;

    public Person(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public void introduce(){
        System.out.printf("Oi, meu nome é %s e tenho %d anos %n", this.name, this.age);
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getEmail(){
        return this.email;
    }
}

class Student extends Person{
    protected String registration;
    protected String course;

    public Student(String name, int age, String email, String registration, String course){
        super(name,age,email);
        this.registration = registration;
        this.course = course;
    }
    public void introduce(){
        System.out.printf("Nome: %s | Idade: %d | Curso: %s | Matrícula: %s %n", this.name, this.age, this.course, this.registration);
    }
}

class Teacher extends Person{
    protected String classDiscipline;
    protected Double salary;

    public Teacher(String name, int age, String email, String classDiscipline, Double salary){
        super(name, age, email);
        this.classDiscipline = classDiscipline;
        this.salary = salary;
    }
    public void introduce(){
        System.out.printf("Nome: %s | Idade: %d | Email: %s | Matéria: %s | Salário: %f %n", this.name, this.age, this.email, this.classDiscipline, this.salary);
    }
    public Double countBonus(){
        return this.salary * 0.1;
    }
}

class Employee extends Person{
    protected String departament;
    protected int hoursWorking;
    protected Double salaryHour;

    public Employee(String name, int age, String email, String departament, int hoursWorking, Double salaryHour){
        super(name, age, email);
        this.departament = departament;
        this.hoursWorking = hoursWorking;
        this.salaryHour = salaryHour;
    }
    public Double countSalary(){
        return hoursWorking * salaryHour;
    }
}

class Monitor extends Student{
    protected int hours;

    public Monitor(String name, int age, String email, String registration, String course){
        super(name, age, email, registration, course);
    }
    public void introduce(){
        System.out.printf("Nome: %s | Idade: %d | Curso: %s | Matrícula: %s | Horas de Monitoria: %d %n", this.name, this.age, this.course, this.registration, this.hours);
    }

    public int setHours(int value){
       return this.hours = value;
    }

    public int countPayment(){
        return this.hours * 10;
    }
}

