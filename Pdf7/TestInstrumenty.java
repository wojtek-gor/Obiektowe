package pl.imiajd.goralski;

import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args){
        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        orkiestra.add(new Flet("Włodek",1990));
        orkiestra.add(new Flet("Adi",1999));
        orkiestra.add(new Fortepian("Mirek",1992));
        orkiestra.add(new Fortepian("Antonio",1980));
        orkiestra.add(new Skrzypce("Alonzo",1850));
        for(Instrument i: orkiestra)
        {
            System.out.println(i.dzwiek());
        }
    }
}
