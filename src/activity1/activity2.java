
package activity1;

import java.util.Scanner;


public class activity2 {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter Employee Name: ");
        String ename = sc.nextLine();
        System.out.print("Enter Hourly Rate: ");
        float hrate = sc.nextFloat ();
        System.out.print("Enter total hours worked: ");
        float hours = sc.nextFloat();
        
        System.out.println("--------Wage Summary--------");
        System.out.println("Employee: "+ename);
        System.out.println("Hourly Rate:"+hrate);
        System.out.println("Hours Worked:"+hours);
        System.out.println("Gross Weekly Wage: "+(hours*hrate));
        System.out.printf("SSS Contribution (10%%): %.2f)\n", ((hours*hrate)*0.1));
        System.out.println("----------------------------");
        System.out.printf("Net Weekly Wage: %.2f\n\n",((hours*hrate)- (hours*hrate)*0.1));
    }
    
}
