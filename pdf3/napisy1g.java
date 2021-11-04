import java.util.Scanner;

public class napisy1g {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String napis1 = scanner.nextLine();
        napis1 = nice(napis1);
        System.out.print(napis1);
    }
    public static String nice(String str)
    {
        String str2="";
        for(int i=str.length(), j=0;i>0;i--,j++)
        {
            char znak = str.charAt(j);
            str2 = new StringBuffer(str2).append(znak).toString();
            if(i%3==1 && i!=1)
            {
                str2 = new StringBuffer(str2).append("'").toString();
            }
        }
        return str2;
    }
}
