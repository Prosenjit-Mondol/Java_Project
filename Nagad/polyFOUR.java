/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nagad;

import javax.swing.JOptionPane;


public class polyFOUR extends polymorphism{
    @Override
    void cas(){
         number=JOptionPane.showInputDialog("Enter Merchant A/c Number:");
                     amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                     number2=JOptionPane.showInputDialog("Enter Counter Number:");
                     ref=JOptionPane.showInputDialog("Enter Refferance:");
                     pin=Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      Payment
                                                                      To:"""+number+"\nAmount: Tk "+amount+"\nCounter :"+number2+"\nReference :"+ref+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"""
                                                       Payment
                                                       To: """+number+"\nAmount: Tk "+amount+"\nCounter :"+number2+"\nReference :"+ref+" was successfull.");
                    else
                    {
                        chack();
                    }
    }
}