
// PROSENJIT MONDOL
import javax.swing.JOptionPane;
public class Project {
    public static void main(String[] args)
    {
        String name=JOptionPane.showInputDialog("Enter your account name:");

        JOptionPane.showMessageDialog(null, "Welllcome to your "+name+" account");

        int num=Integer.parseInt(JOptionPane.showInputDialog(name+"\n"+"1.Case Out\n2.Send Money\n3.Mobile Recharge\n4.Payment\n5.Bill Pay\n6.My Nagad\n7.PIN Reset"));
        switch (num) {
            case 1:
                {
                    String number=JOptionPane.showInputDialog("Enter Uddokta a/c Number:");
                    int amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                    int pin=Integer.parseInt(JOptionPane.showInputDialog("Case Out\n"+"To:"+number+"\nAmount: Tk "+amount+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Case Out\n"+"To: "+number+"\nAmount: Tk "+amount+" was successfull.");
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Case Out\n"+"To: "+number+"\nAmount: Tk "+amount+" was successfull.");
                                break;
                            }
                        }
                        
                    }
                }
                break;

            case 2:
                {
                    String number=JOptionPane.showInputDialog("Enter Received Account Number:");
                    int amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                    String ref=JOptionPane.showInputDialog("Enter Refferance:");
                    int pin=Integer.parseInt(JOptionPane.showInputDialog("Case Out\n"+"To:"+number+"\nAmount: Tk "+amount+"Ref: "+ref+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Send Money\n"+"To: "+number+"\nAmount: Tk "+amount+"Ref: "+ref+" was successfull.");
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Send Money\n"+"To: "+number+"\nAmount: Tk "+amount+"Ref: "+ref+" was successfull.");
                                break;
                            }
                        }
                        
                    }
                }
                break;
            case 3:
            {
                int ope=Integer.parseInt(JOptionPane.showInputDialog("Select Operator\n"+"1.Teletalk\n2.Airtel\n3.GP\n4.Robi\n5.Banglalink\n"));
                int type=Integer.parseInt(JOptionPane.showInputDialog("Select Account type\n"+"1.Prepaid\n2.Postpaid\n"));
                String number=JOptionPane.showInputDialog("Enter mobile Number:");
                    int amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                   
                    int pin=Integer.parseInt(JOptionPane.showInputDialog("Mobile Recharge\n"+"To:"+number+"\nAmount: Tk "+amount+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Mobile Recharge \n"+"To: "+number+"\nAmount: Tk "+amount+" was successfull.");
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Mobile Recharge\n"+"To: "+number+"\nAmount: Tk "+amount+" was successfull.");
                                break;
                            }
                        }
                        
                    }
            }
            break;
            case 4:
            {
                String number=JOptionPane.showInputDialog("Enter Merchant A/c Number:");
                    int amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                    String number2=JOptionPane.showInputDialog("Enter Counter Number:");
                    String ref=JOptionPane.showInputDialog("Enter Refferance:");
                    int pin=Integer.parseInt(JOptionPane.showInputDialog("Payment\n"+"To:"+number+"\nAmount: Tk "+amount+"\nCounter :"+number2+"\nReference :"+ref+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Payment\n"+"To: "+number+"\nAmount: Tk "+amount+"\nCounter :"+number2+"\nReference :"+ref+" was successfull.");
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Payment\n"+"To: "+number+"\nAmount: Tk "+amount+"\nCounter :"+number2+"\nReference :"+ref+" was successfull.");
                                break;
                            }
                        }
                        
                    }
            }
            break;
            case 5:
            {
                String number=JOptionPane.showInputDialog("1.Electricity\n2.Gas\n3.Internet\n4.Water\n5.TV & Telephone\n6.Education\n7.Bank & FI\n8.Insurance\n9.COVID19 Sample Collection Fee\n10.ekpay");
                    int bilid=Integer.parseInt(JOptionPane.showInputDialog("Enter Customer ID"));
                    int amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                    int pin=Integer.parseInt(JOptionPane.showInputDialog("Bill Payment\n"+"To: "+number+"Customer ID: "+bilid+"\nCustomer Name: PROSENJIT MONDOL"+"\nAmount: Tk "+amount+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Bill Payment\n"+"To: "+number+"Customer ID: "+bilid+"\nCustomer Name: PROSENJIT MONDOL"+"\nAmount: Tk "+amount+" was successfull.");
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Bill Payment\n"+"To: "+number+"Customer ID: "+bilid+"\nCustomer Name: PROSENJIT MONDOL"+"\nAmount: Tk "+amount+" was successfull.");
                                break;
                            }
                        }
                        
                    }
            }
            break;
            case 6:
            {
                int nagad=Integer.parseInt(JOptionPane.showInputDialog("My Nagad\n1.Balance Enquiry\n2.Mini Statement\n3.Update Operator\n4.Update Profit Status\n5.Helpline\n6.Allow New Device\n7.Change Account Type"));
                switch (nagad) {
                    case 1:
                        {
                            int pin=Integer.parseInt(JOptionPane.showInputDialog("Enter PIN:"));
                            if(pin==1111)
                            JOptionPane.showMessageDialog(null,"Your Current Balances is 10,000/= Taka");
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Your Current Balances is 10,000/= Taka");
                                break;
                            }
                        }
                        
                    }
                        }
                        break;

                    case 2:
                    {
                        int pin=Integer.parseInt(JOptionPane.showInputDialog("Enter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Statement List \n"+"1.01/11/2023 Mobile Recharge Tk-50\n2.31/11/2023 Mobile Recharge Tk-50\n3.30/10/2023 P2P Tk-500");
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Statement List \n"+"1.01/11/2023 Mobile Recharge Tk-50\n2.31/11/2023 Mobile Recharge Tk-50\n3.30/10/2023 P2P Tk-500");
                                break;
                            }
                        }
                        
                    }
                    }
                    break;

                    case 3:
                    {
                        int pin=Integer.parseInt(JOptionPane.showInputDialog("Enter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"MNO update successful.");
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"MNO update successful.");
                                break;
                            }
                        }
                        
                    }
                    }
                    break;
                    case 4:
                    {
                        int four=Integer.parseInt(JOptionPane.showInputDialog("Your profit status is currently enabled . do you want to disable it?\n1.Yes\n2.No"));
                        if(four==1)
                        JOptionPane.showMessageDialog(null,"Okay done.");
                        else
                        JOptionPane.showMessageDialog(null,"That's fine.");

                    }
                    break;

                    case 5:
                    {
                        JOptionPane.showMessageDialog(null,"Call 16167 or visit www.nagad.com.bd for more info.");
                    }
                    break;

                    case 6:
                    {
                        int pin=Integer.parseInt(JOptionPane.showInputDialog("DO NOT Proceed if someone toid you to do this.\nEnter Your Nagad PIN to activate your Nagad App\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Your Nagad app is open");
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Your Nagad app is open");
                                break;
                            }
                        }
                        
                    }
                    }
                    break;

                    case 7:
                    {
                        int pin=Integer.parseInt(JOptionPane.showInputDialog("Change Account Type.\nDo you want to change your account to Islamic Account? Please confirm your acting using pin\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Your Nagad Account is active as Islamic Account");
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Your Nagad Account is active as Islamic Account");
                                break;
                            }
                        }
                        
                    }
                    }
                    break;

                    default:
                        break;
                }
            }
            break;
            case 7:
            {
                int reset=Integer.parseInt(JOptionPane.showInputDialog("1.Forgot PIN\n2.Change PIN"));
                switch (reset)
                {
                    case 1:
                        {
                        int nid=Integer.parseInt(JOptionPane.showInputDialog("Enter NID Number:"));
                        int newpin=Integer.parseInt(JOptionPane.showInputDialog("Enter New Pin:"));
                        int conpin=Integer.parseInt(JOptionPane.showInputDialog("Enter Confirm Pin:"));
                        if(newpin==conpin)
                        JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                        else
                            {
                                while (newpin!=conpin) 
                                {
                                    int conpin1=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN\nEnter Confirm Pin:"));
                                    if(newpin==conpin1)
                                    {
                                    JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                                    break;
                                    }
                                }
                            }

                        }
                        break;
                    case 2:
                        {
                        int pin=Integer.parseInt(JOptionPane.showInputDialog("Enter Old Pin:"));
                       if(pin==1111)
                       {
                        int newpin=Integer.parseInt(JOptionPane.showInputDialog("Enter New Pin:"));
                        int conpin=Integer.parseInt(JOptionPane.showInputDialog("Enter Confirm Pin:"));
                        if(newpin==conpin)
                        JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                        else
                            {
                                while (newpin!=conpin) 
                                {
                                    int conpin1=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN\nEnter Confirm Pin:"));
                                    if(newpin==conpin1)
                                    {
                                    JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                                    break;
                                    }
                                }
                            }
                       }
                    
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111)
                            {
                              int newpin=Integer.parseInt(JOptionPane.showInputDialog("Enter New Pin:"));
                              int conpin=Integer.parseInt(JOptionPane.showInputDialog("Enter Confirm Pin:"));
                              if(newpin==conpin)
                              JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                              else
                              {
                                while (newpin!=conpin) {
                                    int conpin1=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN\nEnter Confirm Pin:"));
                                    if(newpin==conpin1)
                                    {
                                    JOptionPane.showMessageDialog(null,"Your new pin setup successfull .\nPlease keep it mind.");
                                    break;
                                    }
                                }
                              }
                              break;
                            }
                        }
                        
                     }
                    }
                        break;    
                    default:
                        break;
                }
            }
            break;
            default:
               break;
        }
    }
}