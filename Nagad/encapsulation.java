
package Nagad;

import javax.swing.JOptionPane;

public class encapsulation extends inherite{

    
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    inherite in;
    void en(){
        in=new inherite();//aggregation
        //String s=in.name;
        int nagad=Integer.parseInt(JOptionPane.showInputDialog("My Account \n1.Balance Enquiry\n2.Mini Statement\n3.Update Operator\n4.Update Profit Status\n5.Helpline\n6.Allow New Device\n7.Change Account Type"));
                switch (nagad) {
                    case 1 -> {
                             pin=Integer.parseInt(JOptionPane.showInputDialog("Enter PIN:"));
                             while (pin!=1111){
                             pin=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            }
                            JOptionPane.showMessageDialog(null,"Your Current Balances is "+balance+" Taka");
                    
                        break;
                        }

                    case 2 -> {
                         pin=Integer.parseInt(JOptionPane.showInputDialog("Enter PIN:"));
                         while (pin!=1111){
                             pin=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                         }
                         JOptionPane.showMessageDialog(null, """
                                                        Statement List 
                                                        1.01/11/2023 Mobile Recharge Tk-50
                                                        2.31/11/2023 Mobile Recharge Tk-50
                                                        3.30/10/2023 P2P Tk-500""");
                         break;
                    
                    }

                    case 3 -> {
                         pin=Integer.parseInt(JOptionPane.showInputDialog("Enter PIN:"));
                         while (pin!=1111){
                             pin=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                         }
                         JOptionPane.showMessageDialog(null,"MNO update successful.");
                                break;
                    }
                    case 4 -> {
                         four=Integer.parseInt(JOptionPane.showInputDialog("Your profit status is currently enabled . do you want to disable it?\n1.Yes\n2.No"));
                        if(four==1)
                        JOptionPane.showMessageDialog(null,"Okay done.");
                        else
                        JOptionPane.showMessageDialog(null,"That's fine.");

                    }

                    case 5 -> {
                        JOptionPane.showMessageDialog(null,"Call 16167 or visit www.nagad.com.bd for more info.");
                    }

                    case 6 -> {
                         pin=Integer.parseInt(JOptionPane.showInputDialog("DO NOT Proceed if someone toid you to do this.\nEnter Your Nagad PIN to activate your Nagad App\nEnter PIN:"));
                         while (pin!=1111){
                             pin=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            }
                         JOptionPane.showMessageDialog(null,"Your Nagad app is open");
                         break;
                    }

                    case 7 -> {
                         pin=Integer.parseInt(JOptionPane.showInputDialog("Change Account Type.\nDo you want to change your account to Islamic Account? Please confirm your acting using pin\nEnter PIN:"));
                         while (pin!=1111){
                             pin=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            }
                    JOptionPane.showMessageDialog(null,"Your Nagad Account is active as Islamic Account");
                    
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null,"Invalid type.");
                        break;
                    }
                }
    }
    
    void EMI(){
       int op=Integer.parseInt(JOptionPane.showInputDialog("Select Company\n\n1.Aspada Paribesh Unnayan Foundation\n2.Padakhep Manabik Unnayan Kendra\n3.Palli Mongal karmosuchi(PMK)\n4.BURO Bangladesh"));

       switch(op){
           case 1 -> {
                int ax=Integer.parseInt(JOptionPane.showInputDialog("Enter Receive Account Number:"));
               while(1300000000>=ax)
                    ax=Integer.parseInt(JOptionPane.showInputDialog("Invalid Account Number:"));
               JOptionPane.showMessageDialog(null,"Biller Product Control. Product Not Found.");
            }
           case 2 -> {
                int ax=Integer.parseInt(JOptionPane.showInputDialog("Enter Receive Account Number:"));
               while(1300000000>=ax)
                    ax=Integer.parseInt(JOptionPane.showInputDialog("Invalid Account Number:"));
               JOptionPane.showMessageDialog(null,"Biller Product Control. Product Not Found.");
            }
           case 3 -> {
                int ax=Integer.parseInt(JOptionPane.showInputDialog("Enter Receive Account Number:"));
               while(1300000000>=ax)
                    ax=Integer.parseInt(JOptionPane.showInputDialog("Invalid Account Number:"));
               JOptionPane.showMessageDialog(null,"Biller Product Control. Product Not Found.");
            }
           case 4 -> {
                int ax=Integer.parseInt(JOptionPane.showInputDialog("Enter Receive Account Number:"));
               while(1300000000>=ax)
                    ax=Integer.parseInt(JOptionPane.showInputDialog("Invalid Account Number:"));
               JOptionPane.showMessageDialog(null,"Biller Product Control. Product Not Found.");
            }
           default -> {
               JOptionPane.showMessageDialog(null,"Invalid type.");
               break;
            }
        }
    }
}
