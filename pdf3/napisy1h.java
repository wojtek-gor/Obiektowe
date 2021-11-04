import java.util.Scanner;

public class napisy1h {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String napis1 = scanner.nextLine();
        String sep = scanner.nextLine();
        char sep2 = sep.charAt(0);
        int poz=scanner.nextInt();
        napis1 = nice(napis1,sep2,poz);
        System.out.print(napis1);
    }
    public static String nice(String str, char sep, int poz)
    {
        String str2="";
        for(int i=str.length(), j=0;i>0;i--,j++)
        {
            char znak = str.charAt(j);
            str2 = new StringBuffer(str2).append(znak).toString();
            if(i%poz==1 && i!=1)
            {
                str2 = new StringBuffer(str2).append(sep).toString();
            }
        }
        return str2;
    }
}
