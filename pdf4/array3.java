import java.util.ArrayList;
import java.util.Collections;
public class array3 {
    public static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista.add(7);
        lista.add(4);
        lista.add(9);
        lista.add(8);
        lista2.add(6);
        lista2.add(8);
        ArrayList<Integer> suma = mergeSorted(lista,lista2);
        suma.forEach(x -> System.out.println(x));
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> suma = new ArrayList<Integer>();
        int roz=0;
        if(a.size()<b.size())
            roz = b.size();
        else
            roz = a.size();
        for(int i=0;i<roz; i++)
        {
            if(a.size()>i)
                suma.add(a.get(i));
            if (b.size()>i)
                suma.add(b.get(i));
        }
        Collections.sort(suma);
        return suma;
    }

}
