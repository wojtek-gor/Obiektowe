import java.util.ArrayList;

public class array1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista.add(1);
        lista.add(4);
        lista2.add(6);
        lista2.add(8);
        ArrayList<Integer> suma = append(lista,lista2);
        suma.forEach(x -> System.out.println(x));
    }
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
       ArrayList<Integer> suma = new ArrayList<Integer>();
       for(int i=0;i<a.size();i++)
       {
           suma.add(a.get(i));
       }
        for(int i=0;i<b.size();i++)
        {
            suma.add(b.get(i));
        }
       return suma;
    }
}
