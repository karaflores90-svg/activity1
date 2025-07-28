
package activity1;

import java.util.Scanner;


public class Activity1 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        String name;
        int grade =0;
        
        System.out.print("Enter student Name:");
        name = sc.nextLine();
        
        System.out.print("Enter number of Subjects:");
        int num  = sc.nextInt();
        
            for(int i = 1; i <= num; i++){
                System.out.print("Enter grade for sub" +i+ ": ");
                grade += sc.nextInt();
                
            }
            
            float average = grade / num;
            
            
            System.out.println("Average: " +average);
            
            if (average >=75){
                System.out.println("PASSED!");
            }else{
                System.out.println("FAILED!");
            }
            
    }
            
}
