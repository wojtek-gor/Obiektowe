package pl.imiajd.goralski;

public class Osoba {
    Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rokUrodzenia;
    }
    public String toString(){
        return nazwisko+" urodzony w "+rokUrodzenia+" roku";
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public int getRokUrodzenia(){
        return rokUrodzenia;
    }
    private String nazwisko;
    private int rokUrodzenia;
}
