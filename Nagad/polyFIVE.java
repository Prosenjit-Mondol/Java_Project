/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nagad;

import javax.swing.JOptionPane;


public class polyFIVE extends polymorphism{
    @Override
    void cas(){
                    number=JOptionPane.showInputDialog("1.Electricity\n2.Gas\n3.Internet\n4.Water\n5.TV & Telephone\n6.Education\n7.Bank & FI\n8.Insurance\n9.COVID19 Sample Collection Fee\n10.ekpay");
                    bilid=Integer.parseInt(JOptionPane.showInputDialog("Enter Customer ID"));
                    amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                    pin=Integer.parseInt(JOptionPane.showInputDialog("""
                                                                     Bill Payment
                                                                     To: """+number+"Customer ID: "+bilid+"\nCustomer Name: PROSENJIT MONDOL"+"\nAmount: Tk "+amount+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"""
                                                       Bill Payment
                                                       To: """+number+"Customer ID: "+bilid+"\nCustomer Name: PROSENJIT MONDOL"+"\nAmount: Tk "+amount+" was successfull.");
                    else
                    {
                        chack();
                    }
    }
}

