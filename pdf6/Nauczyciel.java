package pl.imiajd.goralski;

public class Nauczyciel extends Osoba {
    Nauczyciel(Osoba osoba, double pensja){
        super(osoba.getNazwisko(),osoba.getRokUrodzenia());
        this.pensja=pensja;
    }
    public String toString(){
        return getNazwisko()+" urodzony w "+getRokUrodzenia()+" roku, zarabia "+pensja;
    }

    public double getPensja() {
        return pensja;
    }

    private double pensja;
}
