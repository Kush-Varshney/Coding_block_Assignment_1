import java.util.*;
public class Stringcode1 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        for (int  i=0;i<a.length();i++){
            char b=a.charAt(i);
            if(b<='Z'&&b>='A'){
                System.out.println(); 
                System.out.print(b);
            }
            else{
                System.out.print(b);
            }
        }
    }
}