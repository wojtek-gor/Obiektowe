import java.util.Scanner;

public class napisy1c {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();
        System.out.println(middle(napis));
    }
    public static String middle(String str)
    {
        if(str.length()%2==1)
        {
            int in = str.length()/2+1;
            return str.substring(in-1,in);
        }
        int in = str.length()/2;
        return str.substring(in-1,in+1);
    }
}
