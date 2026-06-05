import java.util.*;
public class random_string_generator {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String ch="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        System.out.println("How many strings do you want to generate?");
        int d=sc.nextInt();
        int a=1;
        while(d>0)
        {
            String s="";
            System.out.println("What should be the length of the String " + (a));
            int e=sc.nextInt();
            for(int i=0;i<e;i++)
            {
                int r = (int) (Math.random() * 52);
                s=s+ch.charAt(r);
            }
            list.add(s);
            d--;
            a++;
        }
        System.out.println(list);
    }
}
