import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String w=". -_/\\|;,";
        StringBuilder sb= new StringBuilder();

        if(Character.isLetter(s.charAt(0)))
            sb.append(Character.toUpperCase(s.charAt(0)));

        for(int i=1;i<s.length();i++)
        {   boolean char_Separated=w.contains(String.valueOf(s.charAt(i-1)));
            boolean camel_Case=Character.isLowerCase(s.charAt(i-1))&&Character.isUpperCase(s.charAt(i));
            if(char_Separated||camel_Case)
            {
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
        }

        System.out.println(sb);

    }
}