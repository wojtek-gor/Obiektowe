import java.util.Scanner;

public class napisy1e {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();
        String napis2 = scanner.nextLine();
        int[] tab = where(napis,napis2);
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]==-1)
                break;
            System.out.println(tab[i]);
        }


    }
    public  static int[] where(String str, String subStr)
    {
        int[] tab = new int[str.length()/subStr.length()+2];
        int i=0;
        int j=0;
        for(j=0;j<str.length();j++)
        {
            i=str.indexOf(subStr,i);
            if(i==-1)
                break;
            tab[j]=i;
            i=i+subStr.length();

        }
        tab[j]=-1;
        return tab;
    }
}
