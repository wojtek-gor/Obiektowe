package pl.imiajd.goralski;

public class Skrzypce extends Instrument{
    public Skrzypce(String producent, int rokProd)
    {
        super(producent,rokProd);
    }
    public String dzwiek()
    {
        return "Iiii, iii";
    }

}
