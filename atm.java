import java.io.*;
import java.util.*;
class atm
{
    public static void main(String args[])
    {
        int pin,slct,acc,amt,ms,p,PIN,otp,wd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To NB2 ATM");
        System.out.println(" Please Swipe your card");
        System.out.println("Enter your PIN");
        pin=sc.nextInt();
        System.out.println("PIN Verified");
        System.out.println("Type of account");
        System.out.println("1.Savings Account");
        System.out.println("2.Current Account");
        acc=sc.nextInt();
        System.out.println("Select your option");
        System.out.println("1.Withdrawal");
        System.out.println("2.Mini Statement");
        System.out.println("3.Account Details");
        System.out.println("4.Settings/Help");
        slct=sc.nextInt();
        if(pin<=3333)
        if(slct==1)
        {
            System.out.println("Enter the Amount");
            amt=sc.nextInt();
            if(amt<=25000)
            {
            System.out.println("Your Balance:-12396");
        }
        else
        {
            System.out.println("Invalid Amount.Check your Card Limit");
    }
}
        if(slct==2)
        {
            System.out.println("Mini Statement of your last 5 transaction");
            System.out.println("2000 CR Indian Oil");
            System.out.println("468 CR Mcdonalds");
            System.out.println("6000 DR HDFC xxxx 9856");
            System.out.println("1500 CR PAYTM");
            System.out.println("956 CR BMS");
            System.out.println("Your Balance:-12396");
        }
        if(slct==3)
        {
            System.out.println("Account Details----");
            System.out.println("Card:-Debit Card");
            System.out.println("Bank:-ICICI");
            System.out.println("Branch:-Vartak Nagar");
            System.out.println("Account Number:-5632 2587 4520");
            System.out.println("Your Balance:-12396");
        }
        if(slct==4)
        {
           System.out.println("1.Change PIN");
           System.out.println("2.Your PIN");
           p=sc.nextInt();
          if(p==1)
              {
                 System.out.println("Enter your current PIN");
                 PIN=sc.nextInt();
                 if(pin==PIN)
                 {
                  System.out.println("Enter the OTP sent on your registered no.");  
                  otp=sc.nextInt();
                  System.out.println("Confirmed");
                  System.out.println("PIN changed Successfully");
        }
    }
    else{
        System.out.println("Your PIN="+pin);
    }
}
        else if(pin>3333&&pin<=6666)
        if(slct==1)
        System.out.println("Enter the Amount");
            amt=sc.nextInt();
             if(amt<=25000)
            {
            System.out.println("Your Balance:-14550");
        }
        else
        {
            System.out.println("Invalid Amount.Check your Card Limit");
    }
           
        
        if(slct==2)
        {
            System.out.println("Mini Statement of your last 5 transaction");
            System.out.println("200 CR HPCL");
            System.out.println("468 CR Starbucks");
            System.out.println("6000 DR SBI xxxx 9856");
            System.out.println("1500 CR PAYTM");
            System.out.println("956 CR Cashback");
            System.out.println("Your Balance:-14550");
        }
        if(slct==3)
        {
            System.out.println("Account Details----");
            System.out.println("Card:-Debit Card");
            System.out.println("Bank:-ICICI");
            System.out.println("Branch:-Vartak Nagar");
            System.out.println("Account Number:-5632 2587 4520");
            System.out.println("Your Balance:-14550");
        }
        if(slct==4)
        {
           System.out.println("1.Change PIN");
           System.out.println("2.Your PIN");
           p=sc.nextInt();
          if(p==1)
              {
                 System.out.println("Enter your current PIN");
                 PIN=sc.nextInt();
                 if(pin==PIN)
                 {
                  System.out.println("Enter the OTP sent on your registered no.");  
                  otp=sc.nextInt();
                  System.out.println("Confirmed");
                  System.out.println("PIN changed Successfully");
        }
    }
    else{
        System.out.println("Your PIN="+pin);
    }

    if(pin>6666&&pin<=9999)
    
        if(slct==1)
        System.out.println("Enter the Amount");
            amt=sc.nextInt();
             if(amt<=25000)
            {
            System.out.println("Your Balance:-20156");
        }
        else
        {
            System.out.println("Invalid Amount.Check your Card Limit");
    }
        
        if(slct==2)
        {
            System.out.println("Mini Statement of your last 5 transaction");
            System.out.println("1800 CR BPCL");
            System.out.println("468 CR KFC");
            System.out.println("6000 DR ICICI xxxx 9856");
            System.out.println("500 CR PAYTM");
            System.out.println("612 CR BMS");
            System.out.println("Your Balance:-20156");
        }
        if(slct==3)
        {
            System.out.println("Account Details----");
            System.out.println("Card:-Debit Card");
            System.out.println("Bank:-ICICI");
            System.out.println("Branch:-Vartak Nagar");
            System.out.println("Account Number:-5632 2587 4520");
            System.out.println("Your Balance:-20156");
        }
        if(slct==4)
        {
           System.out.println("1.Change PIN");
           System.out.println("2.Your PIN");
           p=sc.nextInt();
          if(p==1)
              {
                 System.out.println("Enter your current PIN");
                 PIN=sc.nextInt();
                 if(pin==PIN)
                 {
                  System.out.println("Enter the OTP sent on your registered no.");  
                  otp=sc.nextInt();
                  System.out.println("Confirmed");
                  System.out.println("PIN changed Successfully");
        }
    }
    else{
        System.out.println("Your PIN="+pin);
    }
    
    }
}
       System.out.println("Thank You");
}
}
