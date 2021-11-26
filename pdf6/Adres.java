package pl.imiajd.goralski;

public class Adres {
    Adres(String miasto, String kod_pocztowy){
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
    }
    Adres(String miasto, String kod_pocztowy, String ulica, int numer_domu, int numer_mieszkania){
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.numer_mieszkania=numer_mieszkania;
    }
    public void pokaz(){
        System.out.println(kod_pocztowy+" "+miasto);
        System.out.print(ulica+" ");
        System.out.println(numer_domu+" "+numer_mieszkania);
    }
    public boolean przed(Adres adres){
        if(kod_pocztowy.equals(adres.kod_pocztowy)){
            return false;
        }
        for(int i=0;i<adres.kod_pocztowy.length();i++) {
            if((int)kod_pocztowy.charAt(i)<(int)adres.kod_pocztowy.charAt(i))
                return false;
        }
        return true;
    }
    String ulica;
    int numer_domu;
    int numer_mieszkania;
    String miasto;
    String kod_pocztowy;

}
