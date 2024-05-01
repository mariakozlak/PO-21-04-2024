import java.util.ArrayList;

public class Developer extends  Employee{
    Developer(String imie, String nazwisko, String adres, String mail, String pesel, int rokZatrudnienia) {
        super(imie, nazwisko, adres, mail, pesel, rokZatrudnienia);
    }

    ArrayList<Technology> techno = new ArrayList<Technology>();

    public void addTechnology(Technology a) {
        techno.add(a);
    }

    @Override
    public int calculateSalary(int currentYear){
        int baseSalary = 3000;
        int yearsWorked = currentYear - rokZatrudnienia;
        int salary = baseSalary+yearsWorked*1000;

        int sumaDodatek = 0;

        for(int i=0; i< techno.size(); i++){
            sumaDodatek += techno.get(i).dodatek;
        }
        return salary + sumaDodatek;
    }


}

