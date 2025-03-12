import java.util.*;

public class Prog217 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> ts=new TreeSet<Integer>();
        System.out.println("enter integers and 0 to stop");
        while(true)
        {
            int x=sc.nextInt();
            if(x==0)
                break;
            if(!ts.add(x))
                System.out.println("existed");
        }
        Iterator<Integer> i=ts.iterator();
                while(i.hasNext())
                    System.out.println(i.next());
    }
}