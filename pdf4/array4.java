import java.util.ArrayList;

public class array4 {
    public static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(4);
        lista.add(7);
        lista.add(8);
        ArrayList<Integer> suma = reversed(lista);
        suma.forEach(x -> System.out.println(x));
    }
    public static ArrayList<Integer> reversed(ArrayList<Integer> a)
    {
        ArrayList<Integer> nowa = new ArrayList<Integer>();
        for(int i=a.size()-1; i>=0;i--)
        {
            nowa.add(a.get(i));
        }
        return nowa;
    }
}
