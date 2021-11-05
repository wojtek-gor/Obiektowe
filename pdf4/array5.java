import java.util.ArrayList;

public class array5 {
    public static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(4);
        lista.add(7);
        lista.add(8);
        reverse(lista);
        lista.forEach(x -> System.out.println(x));
    }
    public static void reverse(ArrayList<Integer> a)
    {
        for(int i=a.size()-1, j=0; i>=j;i--,j++)
        {
            int bufor = a.get(i);
            a.set(i, a.get(j));
            a.set(j,bufor);

        }
    }
}
