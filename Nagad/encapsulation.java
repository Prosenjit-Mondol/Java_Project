/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nagad;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class encapsulation extends polymorphism {

    void c(){
        while (pin!=1111) {
                             wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Case Out\n"+"To: "+number+"\nAmount: Tk "+amount+" was successfull.");
                                break;
                            }
                        }
    }

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
    
    void en(){
        int nagad=Integer.parseInt(JOptionPane.showInputDialog("My Nagad\n1.Balance Enquiry\n2.Mini Statement\n3.Update Operator\n4.Update Profit Status\n5.Helpline\n6.Allow New Device\n7.Change Account Type"));
                switch (nagad) {
                    case 1 -> {
                             pin=Integer.parseInt(JOptionPane.showInputDialog("Enter PIN:"));
                            if(pin==1111)
                            JOptionPane.showMessageDialog(null,"Your Current Balances is "+balance+" Taka");
                    else
                    {
                        c();
                        
                    }
                        }

                    case 2 -> {
                         pin=Integer.parseInt(JOptionPane.showInputDialog("Enter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Statement List \n"+"1.01/11/2023 Mobile Recharge Tk-50\n2.31/11/2023 Mobile Recharge Tk-50\n3.30/10/2023 P2P Tk-500");
                    else
                    {
                        c();
                        
                    }
                    }

                    case 3 -> {
                         pin=Integer.parseInt(JOptionPane.showInputDialog("Enter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"MNO update successful.");
                    else
                    {
                        c();
                        
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
                        JOptionPane.showMessageDialog(null,"Call 16167 or visit www.nagad.com.bd for more info.");
                    }

                    case 6 -> {
                         pin=Integer.parseInt(JOptionPane.showInputDialog("DO NOT Proceed if someone toid you to do this.\nEnter Your Nagad PIN to activate your Nagad App\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Your Nagad app is open");
                    else
                    {
                        c();
                        
                    }
                    }

                    case 7 -> {
                         pin=Integer.parseInt(JOptionPane.showInputDialog("Change Account Type.\nDo you want to change your account to Islamic Account? Please confirm your acting using pin\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Your Nagad Account is active as Islamic Account");
                    else
                    {
                        c();
                        
                    }
                    }

                    default -> {
            }
                }
    }
}
