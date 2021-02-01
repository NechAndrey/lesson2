package dz;

public class Person {
    private String name;
    private String lastName;
    private String patronymic;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public static void main(String[] args) {
        Person[] persArr = new Person[5];
        persArr[0] = new Person("vasya", "petin", "vladimirovich", "proger", "test@test", 8922, 3000, 25);
        persArr[1] = new Person("vitya", "vasin", "vladimirovich", "consult", "test@test", 8911, 2500, 30);
        persArr[2] = new Person("катя", "иванова", "викторовна", "секретарь", "test@test", 8921, 1000, 27);
        persArr[3] = new Person("Иван", "иванов", "викторович", "директор", "test@test", 8999, 7000, 42);
        persArr[4] = new Person("Павел", "Петров", "викторович", "hr", "test@test", 8989, 4000, 41);

        for (int i = 0; i < persArr.length; i++) {
            persArr[i].printEmployeeInfo(persArr[i]);
            // print all persons
        }
        for (int i = 0; i < persArr.length; i++) {
            persArr[i].printEmployeeInfo(persArr[i], 40);
            // print persons, age >
        }

    }

    public Person(String name, String lastName, String patronymic, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printEmployeeInfo(Person person, int age) {
        if (person.age > age) {
            System.out.println(person.toString());
        } else {
            System.out.println(this.name + " не подходит по возрасту");
        }
    }

    public void printEmployeeInfo(Person person) {
        System.out.println(person.toString());
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Last name: " + this.lastName + " Patronymic: " + this.patronymic + " Position: " + this.position + " Email: " + this.email + " Phone: " + this.phone +
                " Salary: " + this.salary + " Age: " + this.age;
    }
}
