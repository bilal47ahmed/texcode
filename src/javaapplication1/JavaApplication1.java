

package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {
 
 
    public static void main(String[] args) {
       
       
      
     Scanner sc = new Scanner(System.in);
     System.out.println("UserInutp");
             int UserIncome =sc.nextInt();
     int TaxReturn = TaxSlab(UserIncome);
System.out.println(TaxReturn);
     
    
             }
    public static int TaxSlab(int UserIncome)
        {
            int Tax = 0, UserTax = 0, UserInput = UserIncome;
           
            
            if (UserInput > 1500000)
            {
                UserTax = UserInput - 1500000;
                Tax = UserTax * 30 / 100;
                UserInput = 1500000;
              
            }


            if (UserInput >= 1250000 && UserInput <= 1500000)
            {
                UserTax = UserInput - 1250000;
                Tax = Tax + UserTax * 25 / 100;
                UserInput = 1250000;
            }
            if (UserInput >= 1000000 && UserInput <=1250000)
            {
                UserTax = UserInput - 1000000;
                Tax = Tax + UserTax * 20 / 100;
                UserInput =  1000000;
            }
            if (UserInput >= 750000 && UserInput <= 1000000)
            {
                UserTax = UserInput - 750000;
                Tax = Tax + UserTax * 15 / 100;
                UserInput =  750000;
            }
             if (UserInput >= 500000 && UserInput <= 750000)
            {
                UserTax = UserInput - 500000;
                Tax = Tax + UserTax * 10 / 100;
                UserInput = 500000;
            }
             if (UserInput >=250000 && UserInput <= 500000)
            {
                UserTax = UserInput - 250000;
                Tax = Tax + UserTax * 5 / 100;
                UserInput =  250000;
            }

            return UserIncome = UserIncome - Tax;
                         
         
      

        }
         }
    
    

