package pl.imiajd.goralski;

public class Student extends Osoba{
    Student(Osoba osoba, String kierunek){
        super(osoba.getNazwisko(),osoba.getRokUrodzenia());
        this.kierunek=kierunek;
    }
    public String toString(){
        return getNazwisko()+" urodzony w "+getRokUrodzenia()+" roku, studiuje na kierunku "+kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }

    private String kierunek;
}
