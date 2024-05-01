import java.util.ArrayList;

public class Manager extends Employee{
    Manager(String imie, String nazwisko, String adres, String mail, String pesel, int rokZatrudnienia) {
        super(imie, nazwisko, adres, mail, pesel, rokZatrudnienia);
    }
    ArrayList<Goal> goals = new ArrayList<Goal>();

    public void addGoals(Goal b) {
        goals.add(b);
    }

    @Override
    public int calculateSalary(int currentYear){
        int baseSalary = 3000;
        int yearsWorked = currentYear - rokZatrudnienia;
        int sumaDodatek = 0;

        for(int i=0; i< goals.size(); i++){
            sumaDodatek += goals.get(i).bonus;
        }

        return baseSalary+yearsWorked*1000 + sumaDodatek;
    }
}