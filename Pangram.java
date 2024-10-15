import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter an input: ");
        String s= sc.nextLine();
        if(pcChecker(s))
            System.out.println("Given sentence is a Pangram");
        else
            System.out.println("Given sentence is not a Pangram");

    }

    public static boolean pcChecker(String s)
    {
        int[] pc=new int[26];
        int ch=0;

        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                char c = Character.toLowerCase(s.charAt(i));
                pc[c - 'a']++;
                if(pc[c - 'a']==1) {
                    ch++;
                    if(ch==26)
                        return true;
                }
            }

        }
        return false;
    }
}