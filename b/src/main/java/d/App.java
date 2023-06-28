package d;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Tester tester1 = new Tester("John", "Doe", 4, "Intermediate", 2000.0);
        Tester tester2 = new Tester("Jane", "Doe", 3, "Advanced", 2500.0);

        boolean result = Tester.isSalaryGreater(tester1, tester2);
        System.out.println(result);
        tester1.printName();
    }
}
