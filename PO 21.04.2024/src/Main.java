import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        // Creating and adding developers
        Developer dev = new Developer("John", "Doe", "New
                York", "john@doe.com", "123456789", 2020);
        Technology t=new Technology("Java", 800);
        dev.addTechnology(t);
        employees.add(dev);
        // Creating and adding testers
        Tester tester = new Tester("Jane", "Smith", "Los
                Angeles", "jane@smith.com", "987654321", 2021);
        tester.addTestType("UI/UX");
        employees.add(tester);
        // Creating and adding a manager
        Manager manager = new Manager("Bob", "Johnson",
                "Chicago", "bob@johnson.com", "1122334455", 2019);
        Goal g=new Goal(2010, 10, 15, "Implementing FB login",
                1000);
        manager.addGoals(g);
        employees.add(manager);
        // Calculating total amount to be paid
        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
        }
        System.out.println("Total amount to be paid this month:
                " + totalAmount + " USD");
    }

    public class  daneOsobowe{
        public String imie, nazwisko, adres, email, pesel;
        public int  rokZatrudnienia;
        public daneOsobowe(String imie, String nazwisko, String adres, String email, String pesel, int rokZatrudnienia){
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.adres = adres;
            this.email = email;
            this.pesel = pesel;
            this.rokZatrudnienia = rokZatrudnienia;

        }


        }


    public class Employee extends daneOsobowe{
        public Employee(String imie, String nazwisko){
            super(imie, nazwisko);
        }
    }

    public class Developer extends pensja{
        public List<String> Technology;
        public Developer(String imie, String nazwisko, String adres, String email, String pesel, int rokZatrudnienia) {
            super(imie, nazwisko, adres, email, pesel, rokZatrudnienia);
            this.Technology = new ArrayList<>();
        }
    }

    public class Tester extends Developer {
        public List<String> TestType;

        public Tester(){
            super();

        }
    }

    public class pensja extends daneOsobowe {
        int obecnyRok = 2024;
        int rokZatrudnienia;
        int salary;


        public pensja(String imie, String nazwisko, String adres, String email, String pesel, int rokZatrudnienia) {
            super(imie, nazwisko, adres, email, pesel, rokZatrudnienia);

            if (obecnyRok == rokZatrudnienia) {
                salary = 3000;
            } else if (obecnyRok != rokZatrudnienia) {
                salary = 3000 + (obecnyRok - rokZatrudnienia) * 1000;
            }

            // DODAJ PREMIE DLA DEVELOPEROW ORAZ TESTEROW
            int salary;

        }
    }
}

