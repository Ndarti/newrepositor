package d;
public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Перегрузка конструкторов
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate");
    }

    // Перегруженные методы
    public void printName() {
        System.out.println("Name: " + name);
    }

    public void printName(String title) {
        System.out.println(title + " " + name + " " + surname);
    }

    public void printDetails() {
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nExperience in years: " + experienceInYears +
                "\nEnglish level: " + englishLevel + "\nSalary: " + salary);
    }

    // Статический метод
    public static boolean isSalaryGreater(Tester t1, Tester t2) {
        return t1.salary > t2.salary;
    }
}