
import java.util.*;

public class oddeven {
    
    public static void main(String[] args) {
        
        Scanner SC= new Scanner(System.in);
        int x;
        System.out.println("Enter the number:-");
        x = SC.nextInt();

        if(x % 2 == 0) {
            System.out.println( "Even");
        }else {
            System.out.println( "Odd");


        }
    }
    

}
