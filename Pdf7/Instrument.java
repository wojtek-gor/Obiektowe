package pl.imiajd.goralski;

import java.time.LocalDate;

public abstract class Instrument {
    public Instrument(String producent,int rokProd)
    {
        this.producent=producent;
        rokProdukcji = rokProdukcji.of(rokProd,1,1);
    }
    public abstract String dzwiek();
    @Override
    public boolean equals(Object Ins)
    {
        if(this == Ins)
            return true;
        if(Ins == null)
            return false;
        if(getClass() != Ins.getClass())
            return false;
        Instrument ins = (Instrument) Ins;
        if(producent == null)
        {
            if(ins.producent != null)
                return false;
        }
        else if(!producent.equals(ins.producent))
            return false;
        if(rokProdukcji.getYear() != ins.rokProdukcji.getYear())
            return false;
        return true;
    }
    public String toString()
    {
        return "Instrument wykonal "+producent+" w "+getRokProdukcji()+" roku";
    }
    public String getProducent()
    {
        return producent;
    }
    public int getRokProdukcji()
    {
        return rokProdukcji.getYear();
    }
    private String producent;
    private LocalDate rokProdukcji;
}
