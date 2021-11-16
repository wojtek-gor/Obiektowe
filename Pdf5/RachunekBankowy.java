public class RachunekBankowy {
    RachunekBankowy(double saldo){
        this.saldo = saldo;
    }
    static double rocznaStopaProcentowa = 0.04;
    double saldo;
    void obliczMiesieczneOdsetki(){
        double ods = (saldo*rocznaStopaProcentowa)/12;
        saldo=saldo+ods;
    }
    void setRocznaStopaProcentowa(double rocznaStopaProcentowa){
        this.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }
}
