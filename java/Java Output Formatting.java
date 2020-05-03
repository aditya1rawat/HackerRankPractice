//Might want to search some formatting options before attempting this...
//The Error only exists because the class name isn't the same as the file name
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);            
            }
            System.out.println("================================");

    }
}