import java.util.Scanner;
import java.lang.StringBuffer;

public class napisy1f {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String napis1 = scanner.nextLine();
        napis1 = change(napis1);
        System.out.print(napis1);

    }
    public static String change(String str)
    {
        String str2="";
        for(int i=0;i<str.length();i++)
        {
            char znak = str.charAt(i);
            if((int)znak>=65 && (int)znak<=90)
            {
                znak += 32;
                str2 = new StringBuffer(str2).append(znak).toString();
                continue;
            }
            if((int)znak>=97 && (int)znak<=122)
            {
                znak -= 32;
                str2 = new StringBuffer(str2).append(znak).toString();
            }
            if((int)znak == 32)
                str2 = new StringBuffer(str2).append(znak).toString();
        }
        return str2;
    }
}
