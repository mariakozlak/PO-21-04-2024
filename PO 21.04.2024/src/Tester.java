import java.util.ArrayList;

public class Tester extends Employee{
    Tester(String imie, String nazwisko, String adres, String mail, String pesel, int rokZatrudnienia) {
        super(imie, nazwisko, adres, mail, pesel, rokZatrudnienia);
    }

    ArrayList<String> test = new ArrayList<String>();


    public void addTestType(String p){
        test.add(p);
    }

    @Override
    public int calculateSalary(int currentYear){
        int baseSalary = 3000;
        int yearsWorked = currentYear - rokZatrudnienia;

        return baseSalary+yearsWorked*1000 + test.size()*300; //pensja po przeliczeniu
    }




}