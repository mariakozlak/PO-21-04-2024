public class Employee {

    String imie,nazwisko,adres,mail,pesel;
    int rokZatrudnienia;

    Employee(String imie,String nazwisko,String adres,String mail,String pesel, int rokZatrudnienia){
        this.mail = mail;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.rokZatrudnienia = rokZatrudnienia;
        this.pesel = pesel;
        this.imie = imie;
    }

    public int calculateSalary(int currentYear){
        int baseSalary = 3000;
        int yearsWorked = currentYear - rokZatrudnienia;
        int salary = baseSalary+yearsWorked*1000;

        return salary;
    }
}
