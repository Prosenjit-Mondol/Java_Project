/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nagad;

import javax.swing.JOptionPane;


public class polyTHREE extends polymorphism{
    @Override
    void cas(){
        ope=Integer.parseInt(JOptionPane.showInputDialog("""
                                                         Select Operator
                                                         1.Teletalk
                                                         2.Airtel
                                                         3.GP
                                                         4.Robi
                                                         5.Banglalink
                                                         """));
                 type=Integer.parseInt(JOptionPane.showInputDialog("""
                                                                   Select Account type
                                                                   1.Prepaid
                                                                   2.Postpaid
                                                                   """));
                 number=JOptionPane.showInputDialog("Enter mobile Number:");
                     amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                   
                     pin=Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      Mobile Recharge
                                                                      To:"""+number+"\nAmount: Tk "+amount+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"""
                                                       Mobile Recharge 
                                                       To: """+number+"\nAmount: Tk "+amount+" was successfull.");
                    else
                    {
                        chack();
                    }
    }
}
