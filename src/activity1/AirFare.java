
 
package activity1;

import java.util.Scanner;


public class AirFare {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float result = 0;
        float discount;
        
        System.out.print("Enter distance (km): ");
        int distance = input.nextInt();
        
        System.out.print("Class (1 or 2): ");
        int clss = input.nextInt();
        
          if(clss ==1){
              
              result = 250 * distance;
              
              if(distance >= 1000){
                  discount = result * (float)0.1;
                  result = result - distance;
             }
              
              System.out.printf("Total Fare : %.2f\n", result);
              
          }
          else if(clss ==2){
              
              result = 500 * distance;
              
               if(distance >= 1000){
                   discount = result * (float)0.1;
                   result = result - discount;
          }
               System.out.printf("Total Fare : %.2f\n", result);
           }
          
          else{
              System.out.println("Invalid Class!! Try again!");
          }
        
        
        
    }
    
}
