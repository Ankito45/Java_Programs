import java.util.Scanner;  
  
//create ATM class to implement the ATM functionality  
public class ATM 
{  
    //main method starts   
    public static void main(String args[] )  
    {  
        //declare and initialize balance, withdraw, and deposit  
        int balance = 0, withdraw, deposit;  
           
        Scanner var = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = var.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
        withdraw = var.nextInt();  
                      
        if(balance >= withdraw)  
        {  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {    
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        //get deposit amount from the user  
        deposit = var.nextInt();  
                      
        //add the deposit amount to the total balance  
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully deposited");  
        System.out.println("");  
        break;  
   
                case 3:  
        //displaying the total balance of the user  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:    
        System.exit(0);  
            }  
        }  
    }  
}  