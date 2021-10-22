import java.util.Scanner;
import  java.util.Random;

public class CwiczeniaZTablicami
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n=0;
        while(true)
        {
            System.out.println("Podaj n: ");
            n = scanner.nextInt();
            if (n >= 1 && n <= 100)
            {
                break;
            }
            System.out.println("Blad.");
        }
        int[] tab= new int[n];
        generuj(tab,n,999,-999);
        wypisz(tab);
        System.out.println(ileNieparzystych(tab));
        System.out.println(ileParzystych(tab));
        System.out.println(ileDodatnich(tab));
        System.out.println(ileUjemnych(tab));
        System.out.println(ileZerowych(tab));
        System.out.println(ileMaksymalnych(tab));
        System.out.println(sumaDodatnich(tab));
        System.out.println(sumaUjemnych(tab));
        System.out.println(dlugoscMaksymalnaCiaguDodatnich(tab));
        wypisz(tab);
        odwrocFragment(tab,1,4);
        wypisz(tab);
        signum(tab);
        wypisz(tab);
    }
    public static void generuj (int[] tab, int n, int maksymalna, int minimalna)
    {
        Random r = new Random();
        for (int j = 0; j < n; ++j) {
            tab[j] = r.nextInt(maksymalna-minimalna)+minimalna;
        }
    }
    public static void wypisz (int[] tab)
    {
        for(int i=0; i<tab.length; i++)
        {
            System.out.println(tab[i]);
        }
    }
    public  static  int ileNieparzystych (int tab[])
    {
        int j=0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]%2!=0)
            {
                j++;
            }
        }
        return j;
    }
    public  static  int ileParzystych (int tab[])
    {
        int j=0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]%2==0)
            {
                j++;
            }
        }
        return j;
    }
    public static int ileDodatnich(int tab[])
    {
        int j=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0)
            {
                j++;
            }
        }
        return j;
    }
    public static int ileUjemnych(int tab[])
    {
        int j=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]<0)
            {
                j++;
            }
        }
        return j;
    }
    public static int ileZerowych(int tab[])
    {
        int j=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]==0)
            {
                j++;
            }
        }
        return j;
    }
    public static int ileMaksymalnych(int tab[])
    {
        int j=0;
        int maksymalna=tab[0];
        for(int i=1;i<tab.length;i++)
        {
            if(maksymalna<tab[i])
            {
                maksymalna=tab[i];
            }
        }
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]==maksymalna)
            {
                j++;
            }
        }
        return j;
    }
    public static int sumaDodatnich(int tab[])
    {
        int j=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0)
            {
                j+=tab[i];
            }
        }
        return j;
    }
    public static int sumaUjemnych(int tab[])
    {
        int j=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]<0)
            {
                j+=tab[i];
            }
        }
        return j;
    }
    public  static int dlugoscMaksymalnaCiaguDodatnich(int tab[])
    {
        int j=0;
        int dl=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0)
            {
                j++;
            }
            if(tab[i]<0 || i==tab.length-1)
            {
                if(j>=dl)
                {
                    dl=j;
                    j=0;
                }
            }
        }
        return dl;
    }
    public static void signum(int tab[])
    {
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]>0)
                tab[i]=1;
            if(tab[i]<0)
                tab[i]=-1;
        }
    }
    public static void odwrocFragment(int tab[], int lewy, int prawy)
    {
        for(int i=lewy-1,j=prawy-1;i<j; i++, j--)
        {
            int bufor=tab[i];
            tab[i]=tab[j];
            tab[j]=bufor;
        }
    }

}
