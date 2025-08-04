
package activity1;

import Bankapp.bankapp;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        bankapp bank = new bankapp();
        int attemp = 3;
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        
        System.out.print("Enter choice: ");
        int choice = in.nextInt();
        
        switch(choice){
            case 1:
                while( attemp != 0){
       
              
                
                System.out.print("Enter your Account No: ");
                int accountNo = in.nextInt();

                System.out.print("Enter your Pin: ");
                int pin = in.nextInt();
              
                    if (bank.verify_Account(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                        System.exit(0);
                    }else{
                        attemp--;
                        System.out.println("LOGIN FAILED!"+attemp);
                    }
                
                    if (attemp == 0){
                        System.out.println("Try Again Later!!");
                    }
                }
                
                break;
                case 2:
                
                break;
            case 3:
                
                break;
            default:
        
        }
    }
}
    
     
            
 

