public class Main {
    public static void main(String[] args){
        //Zad1
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        saver1.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.saldo);
        System.out.println(saver2.saldo);
        saver1.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.saldo);
        System.out.println(saver2.saldo);
        //Zad2
        IntegerSet pierwszy = new IntegerSet(4);
        IntegerSet drugi = new IntegerSet(6);
        IntegerSet.union(pierwszy,drugi);
        IntegerSet.intersection(pierwszy,drugi);
        pierwszy.insertElement(6);
        IntegerSet.intersection(pierwszy,drugi);
        pierwszy.deleteElement(6);
        IntegerSet.intersection(pierwszy,drugi);
        System.out.println(drugi.toString());
        pierwszy.equals(drugi);

    }
}
