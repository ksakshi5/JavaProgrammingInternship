import java.util.Scanner;  
public class ATMInterface 
{     
    public static void main(String args[] )  
    {   
        int balance = 101010, withdraw, deposit;  
 
        Scanner scan = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  

            int choice = scan.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter currency to be withdrawn:");   
        withdraw = scan.nextInt();                
        if(balance >= withdraw)  
        {  
            balance = balance - withdraw;  
            System.out.println("Please collect your currency!!!");  
        }  
        else  
        {              
            System.out.println("You can't withdraw money, Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:               
        System.out.print("Enter currency to be deposited:");   
        deposit = scan.nextInt();   
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        //exit from the menu  
        System.exit(0);  
            }  
        }  
    }  
}  