
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
                            if(pin==1111)
                            JOptionPane.showMessageDialog(null,"Your Current Balances is "+balance+" Taka");
                    else
                    {
                        while (pin!=1111) {
                             wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Your Current Balances is "+balance+" Taka");
                                break;
                            }
                        }
                        
                    }
                        }

                    case 2 -> {
                         pin=Integer.parseInt(JOptionPane.showInputDialog("Enter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Statement List \n"+"1.01/11/2023 Mobile Recharge Tk-50\n2.31/11/2023 Mobile Recharge Tk-50\n3.30/10/2023 P2P Tk-500");
                    else
                    {
                        while (pin!=1111) {
                             wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Statement List \n"+"1.01/11/2023 Mobile Recharge Tk-50\n2.31/11/2023 Mobile Recharge Tk-50\n3.30/10/2023 P2P Tk-500");
                                break;
                            }
                        }
                    }
                    }

                    case 3 -> {
                         pin=Integer.parseInt(JOptionPane.showInputDialog("Enter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"MNO update successful.");
                    else
                    {
                        while (pin!=1111) {
                             wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"MNO update successful.");
                                break;
                            }
                        }
                        
                    }
                    }
                    case 4 -> {
                         four=Integer.parseInt(JOptionPane.showInputDialog("Your profit status is currently enabled . do you want to disable it?\n1.Yes\n2.No"));
                        if(four==1)
                        JOptionPane.showMessageDialog(null,"Okay done.");
                        else
                        JOptionPane.showMessageDialog(null,"That's fine.");

                    }

                    case 5 -> {
                        JOptionPane.showMessageDialog(null,"Call 16167 or visit www."+name+".com.bd for more info.");
                    }

                    case 6 -> {
                         pin=Integer.parseInt(JOptionPane.showInputDialog("DO NOT Proceed if someone toid you to do this.\nEnter Your "+name+" PIN to activate your "+name+" App\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Your "+name+" app is open");
                    else
                    {
                        while (pin!=1111) {
                             wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Your "+name+" app is open");
                                break;
                            }
                        }
                        
                    }
                    }

                    case 7 -> {
                         pin=Integer.parseInt(JOptionPane.showInputDialog("Change Account Type.\nDo you want to change your account to Islamic Account? Please confirm your acting using pin\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Your "+name+" Account is active as Islamic Account");
                    else
                    {
                        while (pin!=1111) {
                             wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Your "+name+" Account is active as Islamic Account");
                                break;
                            }
                        }
                        
                    }
                    }
                    default -> {
                    }
                }
    }
}
