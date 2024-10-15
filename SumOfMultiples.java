import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter level number: ");
        int lvl= sc.nextInt();

        System.out.print("Enter number of magical items collected: ");
        int mi= sc.nextInt();

        System.out.print("Enter the base value of magical items: ");
        List<Integer> bv= new ArrayList<>();

        for(int i=0;i<mi;i++)
            bv.add(sc.nextInt());

        System.out.println("Energy points: "+som(lvl, bv));

    }
    public static int som(int lvl, List<Integer> bv)
    {
        Set<Integer> pts= new HashSet<>();
        int ep=0;
        for(int x:bv)
        {
            int t=x;
            while(t<lvl)
            {
                if(pts.add(t))
                {
                    ep+=t;
                }
                t+=x;
            }
        }
        return ep;
    }
}